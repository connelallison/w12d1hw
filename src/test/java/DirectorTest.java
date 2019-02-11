import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Dominic", "D1G175", 500000, "sales", 2000000);
    }

    @Test
    public void hasName() {
        assertEquals("Dominic", director.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("D1G175", director.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(500000, director.getSalary(), 1);
    }

    @Test
    public void hasDeptName() {
        assertEquals("sales", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(2000000, director.getBudget(), 1);
    }

    @Test
    public void canGetRaise() {
        director.raiseSalary(50000);
        assertEquals(550000, director.getSalary(), 1);
    }

    @Test
    public void canGetBonus() {
        assertEquals(10000, director.paybonus(), 1);
    }
}
