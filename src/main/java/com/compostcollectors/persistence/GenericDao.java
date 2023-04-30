package com.compostcollectors.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/** GenericDao class
 * This class represents the generic dao
 * @author npeck
 */
public class GenericDao<T> {
    private Class<T> type;
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Instantiates a generic dao
     * @param type the entity type.
     */
    public GenericDao(Class<T> type) {
        this.type = type;
    }
    /**
     * method getOrderById
     * retrieves a entity based on a specific Id
     * @param id - entity passed to the method
     * @return entity - entity based on the Id
     */
    public <T>T getById(int id) {
        Session session = getSession();
        T entity = (T)session.get(type, id);
        session.close();
        return entity;
    }
    /**
     * Delete a entity
     * @param entity Order to be deleted
     */
    public void delete(T entity) {
        Session session = getSession();
        Transaction transaction = getTransaction(session);
        session.delete(entity);
        transaction.commit();
        session.close();
    }
    /** method getAllOrders
     * Method that selects all entities from the order database.
     * @return executeQuery(sql) results from the database query
     */
    public List<T> getAll() {
        Session session = getSession();
        CriteriaBuilder builder = getCriteriaBuilder(session);
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        List<T> list = session.createQuery(query).getResultList();
        session.close();
        return list;
    }
    /**
     * update entity
     * @param entity  entity to be inserted or updated
     */
    public void saveOrUpdate(T entity) {
        Session session = getSession();
        Transaction transaction = getTransaction(session);
        session.saveOrUpdate(entity);
        transaction.commit();
        session.close();
    }
    /**
     * insert entity
     * @param entity  entity to be inserted or updated
     */
    public int insert(T entity) {
        int id = 0;
        Session session = getSession();
        Transaction transaction = getTransaction(session);
        id = (int)session.save(entity);
        transaction.commit();
        session.close();
        return id;
    }
    /**
     * Get entity by property (exact match)
     * sample usage: getByPropertyEqual("property", "value")
     */
    public List<T> getByPropertyEqual(String property, String value) {
        Session session = getSession();

        logger.debug("Searching for order with " + property + " = " + value);

        CriteriaBuilder builder = getCriteriaBuilder(session);
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        query.select(root).where(builder.equal(root.get(property), value));
        List<T> list = session.createQuery( query ).getResultList();
        session.close();
        return list;
    }
    /**
     * Get entity by property (like)
     * sample usage: getByPropertyLike("property", "value")
     */
    public List<T> getByPropertyLike(String property, String value) {
        Session session = getSession();

        logger.debug("Searching for order with {} = {}",  property, value);

        CriteriaBuilder builder = getCriteriaBuilder(session);
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        Expression<String> propertyPath = root.get(property);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<T> list = session.createQuery( query ).getResultList();
        session.close();
        return list;
    }

    /**
     * getSession method
     * Returns a open session from the SessionFactory provider
     * @return session
     */
    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

    /**
     * getCriteriaBuilder method
     * Creates a CriteriaBuilder objet
     * @param session
     * @return builder object
     */
    private CriteriaBuilder getCriteriaBuilder(Session session) {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        return  builder;
    }

    /**
     * getTransaction method
     * Takes a session object and returns a Transaction object
     * @param session
     * @return Transaction object
     */
    private Transaction getTransaction(Session session) {
        return session.beginTransaction();
    }
}
