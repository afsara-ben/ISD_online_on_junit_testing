/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIT
 */
public class Employee {
   private String name;
   private double monthlySalary;
   private int age;
   private int service_year; 
   private Manager manager ; 

   
   
    public Employee(String name, double monthlySalary, int age, int year) {
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.age = age;
        this.service_year = year ; 
        this.manager = null ; 
    }
    
    // You can write other getters or setter methods 
    public String getName()
    {
        return this.name;
    }
    public void setsalary(double m)
    {
        this.monthlySalary=m;
    }
    public double getsalary()
    {
        return this.monthlySalary;
    }
    public void setserv(int m)
    {
        this.service_year=m;
    }
    // Implement this, if no manager is found throws an exception 
    public String getManagerName() throws Exception {
        
        if(this.manager==null)
        {
            throw new Exception("Manager Not Assigned!");
        }
        String get =this.manager.getName();
        return get;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
        manager.add(this);
    }
    
    
    
    // Implement this function, if yearly salary is greater than 2 lakhs 10% tax applied, for more than 5 lakhs 15% tax applied
    
    public double calculateYearlySalary() {
        double yearlySalary = 0 ;
        yearlySalary=12*this.monthlySalary;
        if(yearlySalary>500000)
        {
            yearlySalary-=(0.15*yearlySalary);
        }
        else if(yearlySalary>200000)
        {
            yearlySalary-=(0.10*yearlySalary);
        }
        if(yearlySalary<0)
        {
            return -1.0;
        }
        return yearlySalary ; 
    }
    
    
    // If service year is more than 5 year get a 5% increment, if service year is more than 10 year get 10% increment
    public double get_increment(){
        
        double val=0.0;
        if(this.service_year>10)
        {
            val=(0.1*monthlySalary);
        }
        else if(this.service_year>5)
        {
            val=(0.05*monthlySalary);
        }
        return val ; 
    }
    public int equals(Employee b)
    {
        if(this.name.equals(b.name) && this.manager ==b.manager && this.monthlySalary==b.monthlySalary)
        {
            return 1;
        }
        return 0;
    }
    
}
