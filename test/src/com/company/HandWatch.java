package com.company;

public class HandWatch {

    String state = "NORMAL";
    String state1 = "TIME";
    int m=0, h=0, D=1,M=1,Y=2000;

    public HandWatch() {
    }

    public HandWatch(String state, int m, int h, int d, int m1, int y) {

        if(state =="NORMAL") {
            this.state1 = "TIME";
            this.state = state;
        }
        else if(state =="ALARM") {
            this.state1 = "ALARM";
            this.state = state;
        }
        else if(state =="UPDATE") {
            this.state1 = "MIN";
            this.state = state;
        }
        if(m <60 &&m>=0)
            this.m = m;
        if(h <60 &&h>=0)
            this.h = h;
        if(d <32 &&d>0)
            D = d;
        if(m1 <13 &&m1>0)
            M = m1;
        if(y <2100 &&y>=2000)
            Y = y;
    }

    public void input (char in){

        switch(state)
        {
            case "NORMAL":
                if (in == 'c') {
                    this.state = "UPDATE";
                    state1 = "MIN";
                }
                if (in == 'b') {
                    this.state = "ALARM";
                    state1 = "ALARM";
                }
                if(in == 'a'){
                    if(state1 == "TIME") state1 = "DATE";
                    else if(state1 == "DATE") state1 ="TIME";
                }
                break;
            case "UPDATE":
                if (in == 'd') {
                    this.state = "NORMAL";
                    state1 = "TIME";
                }
                else if (in == 'a') {
                    switch (state1){
                        case "YEAR":
                            state1 = "TIME";
                            state = "NORMAL";
                            break;
                        case "MIN":
                            state1 ="HOUR";
                            break;
                        case "HOUR":
                            state1 ="DAY";
                            break;
                        case "DAY":
                            state1 ="MONTH";
                            break;
                        case "MONTH":
                            state1 ="YEAR";
                            break;
                    }
                }
                else if(in == 'b'){
                    switch (state1){
                        case "YEAR":
                            if(Y==2100) Y=2000;
                            else Y++;
                            break;
                        case "MIN":
                            if(m==59) m=0;
                            else m++;
                            break;
                        case "HOUR":
                            if(h==23) h=0;
                            else h++;
                            break;
                        case "DAY":
                            if(D==31) D=1;
                            else D++;
                            break;
                        case "MONTH":
                            if(M==12) M=1;
                            else M++;
                            break;
                    }
                }
                break;
            case "ALARM":
                if(in =='d'){
                    state= "NORMAL";
                    state1 = "TIME";
                }
                else if(in =='a'){
                    if(state1 == "ALARM")
                        state1 = "CHIME";
                }
                break;
        }
    }
    public String DisplayDate(){
        String date = Integer.toString(Y)+"-"+Integer.toString(M)+"-"+Integer.toString(D);
        System.out.println(date);
        return date;
    }
    public String DisplayTime(){
        String time = Integer.toString(h)+":"+Integer.toString(m);
        System.out.println(time);
        return time;
    }

    public String getState() {
        return state;
    }
}
