import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ManagerTest {
    Employee e1;
    Employee e2;
    Employee e3;
    Manager m1;

    ArrayList<Employee> listOfEmployees;

    @Before
    public void setUp() throws Exception {
        e1 = new Employee("Adit",15000,40,20);
        e2 = new Employee("Saurav",40000,45,25);
        e3 = new Employee("Tulon",60000,55,25);

        m1 = new Manager("Firos",80000,50,30,"General Manager");

        e1.setManager(m1);
        e2.setManager(m1);

        listOfEmployees = new ArrayList<>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        //listOfEmployees.add(e3);
    }

    @Test
    public void getEmployees() {
        ArrayList <Employee> expectedEmployeeList = new ArrayList<>();
        expectedEmployeeList.add(e1);
        expectedEmployeeList.add(e2);

        ArrayList<Employee> realEmployeeList = m1.getEmployees(listOfEmployees);

        assertEquals(expectedEmployeeList,realEmployeeList);
    }

    @Test
    public void get_increment() {

    }
}