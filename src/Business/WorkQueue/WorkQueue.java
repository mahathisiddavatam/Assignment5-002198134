/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public WorkRequest RetrieveOrder(String name){
        
        for(WorkRequest work: workRequestList ){
            
            if(name.equals(work.getCustomer().getId())){
                
                return work;
            }
        }
        return null;
    }
    public WorkRequest GetOrder(int id){
        
        for(WorkRequest work: workRequestList ){
            
            if((id==work.getOrderid())){
                
                return work;
            }
        }
        return null;
    }
    
    
}