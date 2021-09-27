import org.junit.*;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class FastCarTest {
    FastCar c;

    @Before
    public void setUp() throws Exception {
        c = new FastCar(90, 100);
    }

    @Test
    public void TestDrive(){
        assertEquals("You have crashed!", c.drive());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, c.getMaxSpeed());
    }
}
