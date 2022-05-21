package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ATMmachineTest {
    ATMmachine a = new ATMmachine(1234,2000);

    //testing Bottom-up Approach Integration test
    @Test
    public void testisLocked() {
        assertTrue(DriverForIsLocked());
    }
    @Test
    public void testexit() {

        a.exit();
        assertTrue(a.state =="LOCKED");
    }

    @Test
    public void testContainsMoney() {
        assertFalse(DriverForContainsMoney());
    }
    @Test
    public void testValidatePin() {
        assertTrue(DriverForValidatePin());
        assertTrue(DriverForContainsMoney());
    }

    @Test
    public void testValidatePin1() {
        assertFalse(DriverForValidateWrongPin());
    }
    @Test
    public void testWithdraw() {
        assertTrue(DriverForValidatePin());
        assertFalse(DriverForIsLocked());
        assertTrue(DriverForWithdraw());
        assertEquals(1000,a.money);
    }

    @Test
    public void testWithdraw1() {
        assertTrue(DriverForValidatePin());
        assertFalse(DriverForIsLocked());
        assertFalse(DriverForMuchWithdraw());
    }
    @Test
    public void testDeposit() {
        assertTrue(DriverForValidatePin());
        assertFalse(DriverForIsLocked());
        assertTrue(DriverForDeposit());
        assertEquals(3000,a.money);
    }
    @Test
    public void testDeposit1() {
        assertTrue(DriverForValidatePin());
        assertFalse(DriverForIsLocked());
        assertTrue(DriverForDeposit());
        assertEquals(3000,a.money);
    }
    @Test
    public void testWholeSystem() {
        assertTrue(a.validatePin(1234));
        assertTrue(a.withdraw(1500));
        assertEquals(500,a.money);
        assertFalse(a.withdraw(1000));
        assertTrue(a.deposit(3000));
        assertEquals(3500,a.money);
    }



    private boolean DriverForDeposit(){
        return a.deposit(1000);
    }
    private boolean DriverForWithdraw(){
        return a.withdraw(1000);
    }
    private boolean DriverForValidatePin(){
        return a.validatePin(1234);
    }
    private boolean DriverForMuchWithdraw(){
        return a.withdraw(3000);
    }
    private boolean DriverForValidateWrongPin(){
        return a.validatePin(2345);
    }
    private boolean DriverForIsLocked(){
        return a.isLocked();
    }
    private boolean DriverForContainsMoney(){
        return a.containsMoney(1000);
    }
}