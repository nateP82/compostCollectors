package com.compostcollectors.persistence;

import com.compostcollectors.entity.PickupService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

public class PickupServiceDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /** method getAllPickupServices
     * Method that selects all pickupServices from the pickupService database.
     * @return executeQuery(sql) results from the database query
     */
    public List<PickupService> getAllPickupServices() {
        logger.info("Retreiving all pickupServices");
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<PickupService> query = builder.createQuery(PickupService.class);
        Root<PickupService> root = query.from(PickupService.class);
        List<PickupService> pickupServices = session.createQuery(query).getResultList();
        session.close();
        return pickupServices;
    }
    /** method getPickupServicesByLastName
     * Method that selects all pickupServices that match the search term passed to the method
     * @return pickupServices list of pickupServices that match search term
     */
    public List<PickupService> getPickupServicesByLastName(String lastName) {
        logger.info("Retreiving pickupServices by last name");
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<PickupService> query = builder.createQuery(PickupService.class);
        Root<PickupService> root = query.from(PickupService.class);
        Expression<String> propertyPath = root.get("lastName");
        query.where(builder.like(propertyPath, "%" + lastName + "%"));
        List<PickupService> pickupServices = session.createQuery(query).getResultList();
        session.close();
        return pickupServices;
    }
    /**
     * method getPickupServiceById
     * retrieves a pickupService based on a specific Id
     * @param id - Id passed to the method
     * @return pickupService - pickupService based on the Id
     */
    public PickupService getPickupServiceById(int id) {
        logger.info("Retreiving pickupService by Id");
        Session session = sessionFactory.openSession();
        PickupService pickupService = session.get(PickupService.class, id);
        session.close();
        return pickupService;
    }
    /**
     * update pickupService
     * @param pickupService  PickupService to be inserted or updated
     */
    public void saveOrUpdate(PickupService pickupService) {
        logger.info("Saving or updating a pickupService");
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(pickupService);
        transaction.commit();
        session.close();
    }
    /**
     * update pickupService
     * @param pickupService  PickupService to be inserted or updated
     */
    public int insert(PickupService pickupService) {
        logger.info("Inserting a pickupService");
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(pickupService);
        transaction.commit();
        session.close();
        return id;
    }
    /**
     * Delete a pickupService
     * @param pickupService PickupService to be deleted
     */
    public void delete(PickupService pickupService) {
        logger.info("Deleting a pickupService");
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(pickupService);
        transaction.commit();
        session.close();
    }
    /**
     * Get pickupService by property (exact match)
     * sample usage: getByPropertyEqual("lastname", "Curry")
     */
    public List<PickupService> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for pickupService with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<PickupService> query = builder.createQuery( PickupService.class );
        Root<PickupService> root = query.from( PickupService.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<PickupService> pickupServices = session.createQuery( query ).getResultList();

        session.close();
        return pickupServices;
    }
    /**
     * Get pickupService by property (like)
     * sample usage: getByPropertyLike("lastname", "C")
     */
    public List<PickupService> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for pickupService with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<PickupService> query = builder.createQuery( PickupService.class );
        Root<PickupService> root = query.from( PickupService.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<PickupService> pickupServices = session.createQuery( query ).getResultList();
        session.close();
        return pickupServices;
    }
}
