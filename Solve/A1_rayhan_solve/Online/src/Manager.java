

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIT
 */
public class Manager extends Employee{
    
    private String position ; 
    public Employee[] employees;
    public int id;
    public Manager(String name, double monthlySalary, int age, int year, String position) {
        super(name, monthlySalary, age, year);
        this.position = position ; 
        employees=new Employee[1000];
        id=0;
    }
    
    
    
    // Implement this. Return the list of employees under this manager 
    public Employee[] getEmployees(){
        
        return employees ; 
    }
    public void add(Employee e)
    {
        this.employees[id++]=e;
    }
     // For each employee he manages manager gets a 5% increments
    public double get_incrementa(){
        System.out.println(id+" "+super.getsalary());
        return  id*0.05*super.getsalary() ; 
    }
    
    
    
    
}
