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
 * This is SalesList Entity, that contains list of Sale
 * 
 * @author s028945
 */
public class SalesList {

    private List<Sale> sales = null;

    /**
     * Default constructor for SalesList
     */
    public SalesList() {

    }

    /**
     * This function returns list of all sales
     *
     * @return list of sales
     */
    @XmlElementWrapper(name = "sales")
    @XmlElement(name = "sale")
    public List<Sale> getSales() {
        return sales;
    }

    /**
     * This function is used to set list of sales to given one
     *
     * @param sales list of sales
     */
    public void setItems(List<Sale> sales) {
        this.sales = sales;
    }

    /**
     * Method for deleting Sale from list
     *
     * @param sale is an object of entity Sale
     */
    public void deleteFromList(Sale sale) {
        sales.remove(sale);
    }

}
