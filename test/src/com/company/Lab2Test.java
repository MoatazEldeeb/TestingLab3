package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lab2Test {
    Lab2 l = new Lab2();

    @Test
    public void checkEvenOrOdd() {

        assertEquals("Odd",l.checkEvenOrOdd(35));
    }
    @Test
    public void checkEvenOrOdd1() {

        assertEquals("Even",l.checkEvenOrOdd(0));
    }
    @Test
    public void checkEvenOrOdd2() {

        assertEquals("Even",l.checkEvenOrOdd(66));
    }
    @Test
    public void checkEvenOrOdd3() {

        assertEquals("Odd",l.checkEvenOrOdd(-7));
    }


    @Test
    public void AMin() {
        int A[]={12,4,112,-4,-23,0,153};
        assertEquals(-23,l.AMin(A));
    }

    @Test
    public void AMin1() {
        int A[]={12,43,67,89,34,12};
        assertEquals(12,l.AMin(A));
    }

    @Test
    public void AMax() {
        int A[]={12,4,112,-4,-23,0,153};
        assertEquals(153,l.AMax(A));
    }
    @Test
    public void AMax1() {
        int A[]={-12,-34,-56,-12,-8,-1};
        assertEquals(-1,l.AMax(A));
    }
}