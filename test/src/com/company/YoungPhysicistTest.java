package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class YoungPhysicistTest {

    YoungPhysicist y;

    @Test
    public void testfunc1() {
        int nt=3;
        int[][] arr={{4, 1, 7},{-2, 4, -1},{1, -5, -3}};
        y=new YoungPhysicist();
        assertEquals("NO",y.func(arr,nt));
    }

    @Test
    public void testfunc2() {
        int nt=3;
        int[][] arr={{3, -1, 7},{-5, 2, -4},{2, -1, -3}};
        y=new YoungPhysicist();
        assertEquals("NO",y.func(arr,nt));
    }

    @Test
    public void testfunc3() {
        int nt=-1;
        int[][] arr={{3, -1, 7},{-5, 2, -4},{2, -1, -3}};
        y=new YoungPhysicist();
        assertEquals("NO",y.func(arr,nt));
    }





}