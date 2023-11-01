package Test;

import Staff.techStaff.DatabaseAdmin;
import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){databaseAdmin = new DatabaseAdmin("Sally Pally", "JP1025123A", 28000);}

    @Test
    public void hasName(){assertEquals("Sally Pally", databaseAdmin.getName());}

    @Test
    public void hasNiNumber(){ assertEquals("JP1025123A", databaseAdmin.getNiNumber()); }

    @Test
    public void hasSalary(){ assertEquals(28000, databaseAdmin.getSalary(), 0.01); }

    @Test
    public void canRaiseSalary(){databaseAdmin.raiseSalary(2800.00); assertEquals( 30800.00, databaseAdmin.getSalary(), 0.1);}

    @Test
    public void canPayBonus(){assertEquals(280, databaseAdmin.payBonus(), 0.01);}

}
