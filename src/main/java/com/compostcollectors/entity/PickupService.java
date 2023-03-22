package com.compostcollectors.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * PickupService class
 * This class represents the pickup service class and all related service details
 *
 * @author npeck
 */
@Entity(name = "PickupService")
@Table(name = "pickup_service")
public class PickupService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    private String description;
    private String address;

    @Column(name = "pickup_day")
    private String pickupDay;
    @ManyToOne
    private User user;

    /**
     * Instantiates a new Pickup service.
     */
    public PickupService() {
    }

    /**
     * Instantiates a new Pickup service.
     *
     * @param description the description of requested pickup
     * @param address     the address of pickup
     * @param pickupDay  day of pickup
     * @param user        the user
     */
    public PickupService(String description, String address, String pickupDay, User user) {
        this.description = description;
        this.address = address;
        this.pickupDay = pickupDay;
        this.user = user;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets pickup date.
     *
     * @return the pickup date
     */
    public String getPickupDay() {
        return pickupDay;
    }

    /**
     * Sets pickup day.
     *
     * @param pickupDay the pickup day
     */
    public void setPickupDay(String pickupDay) {
        this.pickupDay = pickupDay;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PickupService)) return false;
        PickupService that = (PickupService) o;
        return getId() == that.getId() && getDescription().equals(that.getDescription()) && getAddress().equals(that.getAddress()) && getPickupDay().equals(that.getPickupDay()) && getUser().equals(that.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription(), getAddress(), getPickupDay(), getUser());
    }

    @Override
    public String toString() {
        return "PickupService{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", pickupDate=" + pickupDay +
                ", user=" + user +
                '}';
    }
}
