package Test;

import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){developer = new Developer(
            "Bob Bobson", "JP1025341A", 30000
    );}

    @Test
    public void hasName(){assertEquals("Bob Bobson", developer.getName());}

    @Test
    public void hasNiNumber(){ assertEquals("JP1025341A", developer.getNiNumber()); }

    @Test
    public void hasSalary(){ assertEquals(30000, developer.getSalary(), 0.01); }

    @Test
    public void canRaiseSalary(){developer.raiseSalary(3000.00); assertEquals( 33000.00, developer.getSalary(), 0.1);}

    @Test
    public void canPayBonus(){assertEquals(300, developer.payBonus(), 0.01);}




}
