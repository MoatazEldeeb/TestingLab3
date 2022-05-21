package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class WatermelonTest {

    Watermelon watermelon ;
    public int initW;

    public WatermelonTest() {
    }



    @Test
    public void testDivide() {
        watermelon = new Watermelon(0);
        assertEquals("YES",watermelon.divide(42));
    }
    @Test
    public void testDivide1() {
        watermelon = new Watermelon(0);
        assertEquals("NO",watermelon.divide(23));
    }
    @Test
    public void testDivide2() {
        watermelon = new Watermelon(0);
        assertEquals("NO",watermelon.divide(-1));
    }
    @Test
    public void testDivide3() {
        watermelon = new Watermelon(0);
        assertEquals("YES",watermelon.divide(50));
    }



}