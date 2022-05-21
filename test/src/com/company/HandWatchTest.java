package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class HandWatchTest {
    HandWatch h = new HandWatch();

//    For Edge Coverage
    @Test
    public void input0() {
        String testInput = "aacbabababababad";
        //Convert string to a char array.
        char[] s = testInput.toCharArray();
        for (char c : s) {
            h.input(c);
        }
        assertEquals("2001-2-2", h.DisplayDate());
        assertEquals("1:1", h.DisplayTime());
        assertEquals("NORMAL", h.getState());
    }
    @Test
    public void input1() {
        String testInput = "aacd";
        //Convert string to a char array.
        char[] s = testInput.toCharArray();
        for(char c : s) {
            h.input(c);
        }
        assertEquals("2000-1-1",h.DisplayDate());
        assertEquals("0:0",h.DisplayTime());
        assertEquals("NORMAL",h.getState());
    }

//    For ADUP
    @Test
    public void input2() {
        String testInput = "cbbabbabbabbabb";
        //Convert string to a char array.
        char[] s = testInput.toCharArray();
        for(char c : s) {
            h.input(c);
        }
        assertEquals("2002-3-3",h.DisplayDate());
        assertEquals("2:2",h.DisplayTime());
        assertEquals("UPDATE",h.getState());
    }
    @Test
    public void input3() {
        String testInput = "cbbabbabbabbabb";
        //Convert string to a char array.
        char[] s = testInput.toCharArray();
        for(char c : s) {
            h.input(c);
        }
        assertEquals("2002-3-3",h.DisplayDate());
        assertEquals("2:2",h.DisplayTime());
        assertEquals("UPDATE",h.getState());
    }
    @Test
    public void input4() {
        h=new HandWatch("NORMAL",12,15,31,12,2000);
        String testInput = "cbbabbabbabbabb";
        //Convert string to a char array.
        char[] s = testInput.toCharArray();
        for(char c : s) {
            h.input(c);
        }
        assertEquals("2002-2-2",h.DisplayDate());
        assertEquals("17:14",h.DisplayTime());
        assertEquals("UPDATE",h.getState());
    }


}