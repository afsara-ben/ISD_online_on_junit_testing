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

    
    // Implement this, if no manager is found throws an exception 
    public String getManagerName() {
        return this.manager.getName();
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    // Implement this function, if yearly salary is greater than 2 lakhs 10% tax applied, for more than 5 lakhs 15% tax applied
    
    public double calculateYearlySalary() {
        double yearlySalary = monthlySalary * 12;
		double tax = 0.0;
		if(yearlySalary > 200000 && yearlySalary <= 500000){
			tax = yearlySalary * 0.1;
		} else if(yearlySalary > 500000){
			tax = yearlySalary * 0.15;
		}
		yearlySalary -= tax;
        return yearlySalary ; 
    }
    
    
    // If service year is more than 5 year get a 5% increment, if service year is more than 10 year get 10% increment
    public double get_increment(){
	 	double increment = 0.0;
        if(service_year > 5 && service_year <= 10) increment = 0.05;
		if(service_year > 10) increment = 0.1;
		return increment;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        /*
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectange other = (Rectange) obj;
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        return true;
         */
        final Employee other = (Employee) obj;
        if(!this.name.equals(other.getName())) return false;
        //if(this.age != other.age) return false;
        return true;
    }
}
