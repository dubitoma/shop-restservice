/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.teamproject.Entities;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * This entity is used to store customer's in a list
 *
 * @author s028945
 */
public class CustomerList {

    private List<Customer> customers = null;

    /**
     * Default constructor for CustomerList
     */
    public CustomerList() {

    }

    /**
     * This function returns list of all customers
     *
     * @return list of customers
     */
    @XmlElementWrapper(name = "customers")
    @XmlElement(name = "customer")
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * This function is used to set list of customers to given one
     *
     * @param customers list of customers
     */
    public void setVehicles(List<Customer> customers) {
        this.customers = customers;
    }

    /**
     * Method for deleting Customer from list
     *
     * @param customer is an object of class Customer
     */
    public void deleteFromList(Customer customer) {
        customers.remove(customer);
    }

}
