/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception {
        c = new Car(20, 1000);
    }

    @org.junit.Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(20, c.getMaxSpeed());
    }

    @org.junit.Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(40, c.getMaxSpeed());
    }

    @org.junit.Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(19, c.getMaxSpeed());
    }

    @org.junit.Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000, c.getPrice());
    }

}

