package Test;

import Staff.management.Director;
import Staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){director = new Director(
            "Alice Deejay", "JP1025999A", 80000, 200000
    );}

    @Test
    public void hasName(){
        assertEquals("Alice Deejay", director.getName());
    }

    @Test
    public void hasNiNumber(){ assertEquals("JP1025999A", director.getNiNumber()); }

    @Test
    public void hasSalary(){ assertEquals(80000, director.getSalary(), 0.01); }

    @Test
    public void hasBudget(){ assertEquals(200000, director.getBudget(), 0.1); }

    @Test
    public void canRaiseSalary(){director.raiseSalary(8000.00); assertEquals( 88000.00, director.getSalary(), 0.1);}

    @Test
    public void canPayBonus(){assertEquals(800, director.payBonus(), 0.01);}


}


