/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerlist;
    
    public CustomerDirectory(){
        
        this.customerlist = new ArrayList<Customer>();
        
        
        
    }

    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    
    public Customer addNewCustomer(){
        
        Customer customer = new Customer();
        customerlist.add(customer);
        return customer;
    }
    
    public boolean deleteCustomer(String id){
         for(Customer cust: customerlist){
             if(id.equals(cust.getId())){
                 customerlist.remove(cust);
                 return true;
             }
             
         }
         return false;
    }
    
    
    
}
