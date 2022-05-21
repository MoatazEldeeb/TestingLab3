package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitalWatchTest {

    DigitalWatch w =new DigitalWatch(12,30,15);

    //testing Bottom-up Approach Integration test
    @Test
    public void testGetHours() {
        assertEquals( 12,DriverForGetHours());
    }
    @Test
    public void testGetMinutes() {
        assertEquals( 30,DriverForGetMinutes());
    }

    @Test
    public void testGetSeconds() {
        assertEquals( 15,DriverForGetSeconds());
    }

    @Test
    public void testSetMinutes() {
        DriverForSetMinutes();
        assertEquals( 45,DriverForGetMinutes());
    }

    @Test
    public void testSetSeconds() {
        DriverForSetSeconds();
        assertEquals( 59,DriverForGetSeconds());
    }

    @Test
    public void testSetHours() {
        DriverForSetHours();
        assertEquals( 1,DriverForGetHours());
    }
    @Test
    public void testGetTime() {
        assertEquals("12:30:15",w.getTime());
        DriverForSetHours();
        DriverForSetSeconds();
        DriverForSetMinutes();
        assertEquals("1:45:59",w.getTime());
    }
    @Test
    public void testSetTime() {
        w.setTime(7,34,42);
        assertEquals("7:34:42",w.getTime());
    }

    @Test
    public void testWholeSystem() {
        w.setTime(7,34,42);
        assertEquals("7:34:42",w.getTime());
        w.setTime(31,6,2);
        assertEquals("7:34:42",w.getTime());
        w.setTime(9,30,0);
        assertEquals("9:30:0",w.getTime());
    }




    private void DriverForSetHours(){
        w.setHour(1);
    }

    private void DriverForSetMinutes(){
        w.setMinute(45);
    }

    private void DriverForSetSeconds(){
        w.setSecond(59);
    }

    private int DriverForGetSeconds(){
        return w.getSecond();
    }

    private int DriverForGetMinutes(){
        return w.getMinute();
    }

    private int DriverForGetHours(){
        return w.getHour();
    }

}