package com.compostcollectors.entity;

/**
 * Class that represents a compost collectors user
 *
 * @author npeck
 */
public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String address;
    private int binWeight;

    /**
     * Empty constructor
     */
    public User() {

    }

    /**
     * Constructor with User parameters
     *
     * @param firstName users first name
     * @param lastName  users last name
     * @param userName  users username
     * @param email     users email address
     * @param password  users password
     * @param address   users address
     * @param binWeight total amount of composted materiels based on bin weight
     */
    public User(String firstName, String lastName, String userName, String email, String password, String address, int binWeight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.binWeight = binWeight;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
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
     * Gets bin weight.
     *
     * @return the bin weight
     */
    public int getBinWeight() {
        return binWeight;
    }

    /**
     * Sets bin weight.
     *
     * @param binWeight the bin weight
     */
    public void setBinWeight(int binWeight) {
        this.binWeight = binWeight;
    }

    /**
     * toString method with user information
     * @return User with all infomration
     */
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", binWeight=" + binWeight +
                '}';
    }

}
