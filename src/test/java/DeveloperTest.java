import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("Bob", "D1G175", 50000);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("D1G175", developer.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, developer.getSalary(), 1);
    }

    @Test
    public void canGetRaise() {
        developer.raiseSalary(5000);
        assertEquals(55000, developer.getSalary(), 1);
    }

    @Test
    public void canGetBonus() {
        assertEquals(500, developer.paybonus(), 1);
    }
}
