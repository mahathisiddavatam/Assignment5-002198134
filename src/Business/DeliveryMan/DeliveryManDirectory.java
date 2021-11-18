/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;


import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    private ArrayList<DeliveryMan> deliverymanlist;
    
    public DeliveryManDirectory(){
        
        this.deliverymanlist = new ArrayList<DeliveryMan>();
        
        
        
    }

    public ArrayList<DeliveryMan> getDeliverymanlist() {
        return deliverymanlist;
    }

    public void setDeliverymanlist(ArrayList<DeliveryMan> deliverymanlist) {
        this.deliverymanlist = deliverymanlist;
    }
    
    public DeliveryMan addNewDeliveryMan(){
        
        DeliveryMan deli = new DeliveryMan();
        deliverymanlist.add(deli);
        return deli;
    }
    
    public DeliveryMan RetrieveDeliveryMan(String id){
        
        for(DeliveryMan deli: deliverymanlist){
            
            if(id.equals(deli.id)){
                return deli;
            }
        }
        return null;
    }
    
    public boolean deleteDeliveryMan(String id){
         for(DeliveryMan del: deliverymanlist){
             if(id.equals(del.getId())){
                 deliverymanlist.remove(del);
                 return true;
             }
             
         }
         return false;
    }
    
}
