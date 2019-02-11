import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import management.Manager;

public class ManagerTest {
    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Alan", "D1G175", 200000, "sales");
    }

    @Test
    public void hasName() {
        assertEquals("Alan", manager.getName());
    }

    @Test
    public void hasNIN() {
        assertEquals("D1G175", manager.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(200000, manager.getSalary(), 1);
    }

    @Test
    public void hasDeptName() {
        assertEquals("sales", manager.getDeptName());
    }

    @Test
    public void canGetRaise() {
        manager.raiseSalary(20000);
        assertEquals(220000, manager.getSalary(), 1);
    }

    @Test
    public void canGetBonus() {
        assertEquals(2000, manager.paybonus(), 1);
    }
}
