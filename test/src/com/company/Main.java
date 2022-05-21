package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
        String value = "hello";
        //Convert string to a char array.
        char[] s = value.toCharArray();
        for(char c : s) {
            System.out.println(c);
        }
    }
}
