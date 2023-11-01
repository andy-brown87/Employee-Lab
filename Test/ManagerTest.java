package Test;

import Staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){manager = new Manager(
            "Hubert Henkelstenk", "JP1025635A", 35000, "Finance"
    );}

    @Test
    public void hasName(){
        assertEquals("Hubert Henkelstenk", manager.getName());
    }

    @Test
    public void hasNiNumber(){ assertEquals("JP1025635A", manager.getNiNumber()); }

    @Test
    public void hasSalary(){ assertEquals(35000, manager.getSalary(), 0.01); }

    @Test
    public void hasDeptName(){ assertEquals("Finance", manager.getDeptName()); }

    @Test
    public void canRaiseSalary(){manager.raiseSalary(3500.00); assertEquals( 38500.00, manager.getSalary(), 0.1);}

    @Test
    public void canPayBonus(){assertEquals(350, manager.payBonus(), 0.01);}



}
