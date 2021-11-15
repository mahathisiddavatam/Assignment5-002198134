/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Varakumar
 */
public class Menu {
    
    ArrayList<String> starters = new ArrayList<String>();
    ArrayList<String> maincourse = new ArrayList<String>();
    ArrayList<String> specials = new ArrayList<String>();
    ArrayList<String> dessert = new ArrayList<String>();
    ArrayList<String> beverages = new ArrayList<String>();

    public ArrayList<String> getStarters() {
        return starters;
    }

    public void setStarters(ArrayList<String> starters) {
        this.starters = starters;
    }

    public ArrayList<String> getMaincourse() {
        return maincourse;
    }

    public void setMaincourse(ArrayList<String> maincourse) {
        this.maincourse = maincourse;
    }

    public ArrayList<String> getSpecials() {
        return specials;
    }

    public void setSpecials(ArrayList<String> specials) {
        this.specials = specials;
    }

    public ArrayList<String> getDessert() {
        return dessert;
    }

    public void setDessert(ArrayList<String> dessert) {
        this.dessert = dessert;
    }

    public ArrayList<String> getBeverages() {
        return beverages;
    }

    public void setBeverages(ArrayList<String> beverages) {
        this.beverages = beverages;
    }
    
    public boolean addStarters(String starter){
        
        starters.add(starter);
        return true;
    }
    
    public boolean deleteStarters(String starter){
        
        for(String sta: starters){
            if (sta.equals(starter)){
                
                starters.remove(sta);
                return true;
                
            }
        

    }
        return false;
    }
    
        
    public boolean addMainourse(String main){
        
        maincourse.add(main);
        return true;
    }
    
    public boolean deleteMainCourse(String main){
        
        for(String m: maincourse){
            if (main.equals(m)){
                
                starters.remove(m);
                return true;
                
            }
        

    }
        return false;
    }
        
    public boolean addDessert(String dess){
        
        dessert.add(dess);
        return true;
    }
    
    public boolean deleteDessert(String dess){
        
        for(String sta: dessert){
            if (sta.equals(dess)){
                
                dessert.remove(sta);
                return true;
                
            }
        

    }
        return false;
    }
    
        
    public boolean addSpecials(String starter){
        
        specials.add(starter);
        return true;
    }
    
    public boolean deleteSpecials(String starter){
        
        for(String sta: specials){
            if (sta.equals(starter)){
                
                specials.remove(sta);
                return true;
                
            }
        

    }
        return false;
    }
    
        
        
    
    
    
}
