package com.company;

public class Watermelon {
    int w;

    public Watermelon(int w) {
        this.w = w;
    }

    public String divide(int w){
        if(w>2) {
            if (w % 2 == 0) return "YES";
            else return "NO";
        }
        else{
            return "NO";
        }
    }
}
