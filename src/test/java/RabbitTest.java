import org.junit.*;

import static org.junit.Assert.*;

public class RabbitTest {
    Rabbit r;
    @Before
    public void setUp(){
        r = new Rabbit();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("squeak", r.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1, r.getPrice());
    }

}
