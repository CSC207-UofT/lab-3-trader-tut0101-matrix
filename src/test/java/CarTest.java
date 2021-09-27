import org.junit.*;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception {
        c = new Car(90, 100);
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
