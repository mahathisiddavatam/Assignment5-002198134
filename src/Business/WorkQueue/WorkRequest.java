/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.Restaurant;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author raunak
 */
public class WorkRequest {

    int orderid;
    Customer customer;
    Restaurant restaurant;
    DeliveryMan deliveryman;
    String comment;
    Boolean accept;
    Boolean deliver;
    ArrayList<String> food;
    
    public WorkRequest(){
        
        food = new ArrayList<>();
        
        
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid() {
        
        Random rand = new Random();
        int id = rand.nextInt(1234);
        this.orderid = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public DeliveryMan getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(DeliveryMan deliveryman) {
        this.deliveryman = deliveryman;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getAccept() {
        return accept;
    }

    public void setAccept(Boolean accept) {
        this.accept = accept;
    }

    public Boolean getDeliver() {
        return deliver;
    }

    public void setDeliver(Boolean deliver) {
        this.deliver = deliver;
    }

    public ArrayList<String> getFood() {
        return food;
    }

    public void setFood(ArrayList<String> food) {
        this.food = food;
    }
    
    
    
    
    
    
}
