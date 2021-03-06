/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.teamproject.Entities;

/**
 * This is Customer entity, that keeps information about customer
 *
 * @author s028945
 */
public class Customer {

    private int customerID;
    private String name;
    private String surname;

    /**
     * This is empty default constructor
     */
    public Customer() {
    }

    /**
     * This is parameterized Customer constructor
     *
     * @param customerID contains customer ID
     * @param name contains customer name
     * @param surname contains customer surname
     */
    public Customer(int customerID, String name, String surname) {
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
    }

    /**
     * This function returns is used to retrieve customer ID
     *
     * @return customer ID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * This function is used to set customer ID
     *
     * @param customerID contains customer ID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * This function is used to retrieve customer's name
     *
     * @return customer's name
     */
    public String getName() {
        return name;
    }

    /**
     * This function is used to set customer's name
     *
     * @param name customer's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This function is used to get customer's surname
     *
     * @return customer's surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * This function is used to set customer's surname
     *
     * @param surname customer's surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * This is toString function of Customer
     *
     * @return customer information
     */
    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", name=" + name + ", surname=" + surname + '}';
    }

}
