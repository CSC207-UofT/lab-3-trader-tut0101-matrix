import org.junit.*;

import static org.junit.Assert.*;

public class CatTest {

    Cat c;

    @Before
    public void setUp() throws Exception {
        c = new Cat();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("MeowMeow", c.sound());
    }

    @Test(timeout = 50)
    public void TestgetPrice() {
        assertEquals(2, c.getPrice());
    }
}