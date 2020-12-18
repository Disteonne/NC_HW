package HW_ONE.partOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmployeeTest{

    private Employee[] getEmployees(){
        Employee[] employees=new Employee[]{
                new Employee(1,"Igor","Perishkin",25000),
                new Employee(2,"Irina","Belyaeva",10000),
                new Employee(3,"Petr","Belyaev",10000),
        };
        return employees;
    }


    @Test
    public void testGetID() {
        assertEquals(1,getEmployees()[0].getID());
    }
    @Test
    public void testGetFirstName() {
        assertEquals("Igor",getEmployees()[0].getFirstName());
    }
    @Test
    public void testGetLastName() {
        assertEquals("Perishkin",getEmployees()[0].getLastName());
    }
    @Test
    public void testGetSalary() {
        assertEquals(25000,getEmployees()[0].getSalary());
    }
    @Test
    public void testTestGetName() {
        assertEquals("Igor Perishkin",getEmployees()[0].getName());

    }
    @Test
    public void testSetSalary() {
        Employee employee= getEmployees()[0];
        employee.setSalary(30000);
        assertEquals(30000,employee.getSalary());
    }
    @Test
    public void testGetAnnualSalary() {
        assertEquals(120000,getEmployees()[1].getAnnualSalary());
    }
    @Test
    public void testRaiseSalary() {
        assertEquals(20000 ,getEmployees()[2].raiseSalary(100));
    }
    @Test
    public void testTestToString() {
        assertEquals("Employee[id=1,name=Igor Perishkin,salary=25000]",getEmployees()[0].toString());
    }
}
