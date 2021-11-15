/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        return employee;
    }
    
    public Employee createEmployees(String name,Date date, String phno){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setDate(date);
        employee.setPhno(phno);
        employeeList.add(employee);
        return employee;
    }
    
    public Employee iterateEmployees(String id){
        
        for(Employee emp: employeeList){
            if(id.equals(emp.getId())){
                return emp;
            }
            
        }
        return null;
        
    }
    
    public boolean deleteEmployee(String id){
        Employee emp = iterateEmployees(id);
        if(emp!=null){
            
            employeeList.remove(emp);
            return true;
            
        }
        return false;        
    }
}