/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.eif.viko.teamproject.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lt.eif.viko.teamproject.Entities.Customer;
import lt.eif.viko.teamproject.Entities.Item;

/**
 *
 * @author Tomas
 */
public class ItemDAO implements DAO<Item>{
    
    private final Connection connection;
    private Statement statement = null;
    private ResultSet resultSet = null;
    List<Item> items = new ArrayList<>();

    /**
     * DAO item object constructor
     *
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public ItemDAO() throws SQLException, ClassNotFoundException {
        Database database = new Database();
        connection = database.getConnection();
    }

    @Override
    public List<Item> load() {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM item");
            Boolean next = resultSet.first();
            while (next == true) {
                Item item = new Item();
                item.setItemID(resultSet.getInt("item_ID"));
                item.setItemName(resultSet.getString("item_name"));
                item.setItemPrice(resultSet.getDouble("item_price"));
                item.setItemQuantity(resultSet.getInt("item_quantity"));
                items.add(item);
                next = resultSet.next();
            }
            return items;
        } catch (SQLException ex) {

        }
        return null;
    }

    
    /**
     * 
     * @param id item id
     * @return item
     */
    
    @Override
    public Item get(Object id) {
        int idInt = (int) id;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM item WHERE ID = " + idInt);
            resultSet.first();
            Customer item = new Customer();
            item.setCustomerID(resultSet.getInt("ID"));
            item.setName(resultSet.getString("Name"));
            item.setSurname(resultSet.getString("Surname"));
            return item;

        } catch (SQLException ex) {
       //    Logger.getLogger(DAOCountryDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
     /**
     * insert item object into DB
     *
     * @param object
     */
    @Override
    public void insert(Customer object) {
        try {
            statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO Customer VALUES (" + object.getCustomerID()+ ", '" + object.getName() + "'), '" + object.getSurname()+ "')");
        } catch (SQLException ex) {
       
        }
    }
    
     /**
     * update item object into DB
     *
     * @param object
     */
    @Override
    public void update(Customer object) {
        try {
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE Customer SET Surname =" + object.getSurname() + "' WHERE ID =" + object.getCustomerID());
        } catch (SQLException ex) {
      
        }
    }
    
  /**
     * delete item object from DB
     *
     * @param object
     */
    @Override
    public void delete(Customer object) {
        try {
            statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM Customer WHERE ID = " + object.getCustomerID());
        } catch (SQLException ex) {
           // Logger.getLogger(DAOCountryDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
}
