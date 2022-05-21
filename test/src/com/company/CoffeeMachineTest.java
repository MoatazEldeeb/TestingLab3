package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeMachineTest {
    CoffeeMachine c = new CoffeeMachine();
    //testing Bottom-up Approach Integration test
    @Test
    public void testContainsMoney() {
        assertFalse(DriverForContainsMoney());
    }
    @Test
    public void testInc() {
        DriverForInc();
        assertEquals(1,c.money);
    }
    @Test
    public void testDec() {
        DriverForDec();
        assertEquals(0,c.money);
    }
    @Test
    public void testDec1() {
        DriverForDec();
        DriverForDec();
        assertEquals(0,c.money);
    }

    @Test
    public void testGetCoffee() {
        assertFalse(DriverForGetCoffee());
        DriverForInc();
        DriverForInc();
        assertTrue(DriverForGetCoffee());
        assertEquals(1,c.money);
    }
    @Test
    public void testWholeSys() {
        assertFalse(DriverForGetCoffee());
        DriverForInc();
        DriverForInc();
        assertTrue(DriverForGetCoffee());
        assertEquals(1,c.money);
        DriverForDec();
        assertEquals(0,c.money);

    }


    private boolean DriverForGetCoffee(){
        return c.getCoffee();
    }

    private void DriverForDec(){
        c.dec();
    }

    private void DriverForInc(){
        c.inc();
    }

    private boolean DriverForContainsMoney(){
        return c.containsMoney();
    }
}