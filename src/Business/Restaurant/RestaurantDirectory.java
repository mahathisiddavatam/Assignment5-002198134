/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryMan;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantlist;
    
    public RestaurantDirectory(){
        
        this.restaurantlist = new ArrayList<Restaurant>();
        
        
        
    }

    public ArrayList<Restaurant> getRestaurantlist() {
        return restaurantlist;
    }
    
    public Restaurant RetrieveRestaurant(String name){
        
        for(Restaurant res: restaurantlist){
            
            if(name.equals(res.manager)){
                
                return res;
                
                
            }
        }
        return null;
    }
    
    public Restaurant AcquireRestaurant(String name){
        
        for(Restaurant res: restaurantlist){
            
            if(name.equals(res.name)){
                
                return res;
                
                
            }
        }
        return null;
        
        
    }

    public void setRestaurantlist(ArrayList<Restaurant> restaurantlist) {
        this.restaurantlist = restaurantlist;
    }
    
    
}
