/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author NIT
 */
public class Manager extends Employee{
    
    private String position ; 
    
    public Manager(String name, double monthlySalary, int age, int year, String position) {
        super(name, monthlySalary, age, year);
        this.position = position ; 
    }
    
    // Implement this. Return the list of employees under this manager 
    public ArrayList <Employee> getEmployees(ArrayList <Employee> listOfEmployees){
        ArrayList <Employee> employees = new ArrayList<>();
		for(Employee employee : listOfEmployees){
			String managerName = employee.getManagerName();
			if(managerName.equals(this.getName())){
			    employees.add(employee);
            }
		}
        return employees ; 
    }
    
     // For each employee he manages manager gets a 5% increments
    public double get_increment(){
        return  0.0 ; 
    }

    public static void main(String[] args) {

        ArrayList <Employee> listOfEmployees = new ArrayList<>();

        Employee e1 = new Employee("Adit",30000,40,20);
        Employee e2 = new Employee("Saurav",40000,45,25);

        listOfEmployees.add(e1);
        listOfEmployees.add(e2);

        Manager m1 = new Manager("Firos",80000,50,30,"General Manager");

        e1.setManager(m1);
        e2.setManager(m1);

        ArrayList <Employee> employeesUnderManager = m1.getEmployees(listOfEmployees);
        for(Employee e : employeesUnderManager){
            System.out.println(e);
        }
    }

}
