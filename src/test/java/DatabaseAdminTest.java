import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() throws Exception {
        databaseAdmin = new DatabaseAdmin("Carl", "D1G175", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Carl", databaseAdmin.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("D1G175", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, databaseAdmin.getSalary(), 1);
    }

    @Test
    public void canGetRaise() {
        databaseAdmin.raiseSalary(3000);
        assertEquals(33000, databaseAdmin.getSalary(), 1);
    }

    @Test
    public void canGetBonus() {
        assertEquals(300, databaseAdmin.paybonus(), 1);
    }
}
