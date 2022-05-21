package com.company;

public class DigitalWatch {
    int hour;
    int minute;
    int second;

    public DigitalWatch(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int h, int m, int s){
        if(h>=0 && h<24 && m>=0 && m<60 && s>=0 && s<60){
            setHour(h);
            setMinute(m);
            setSecond(s);
        }
    }

    public String getTime() {
        return Integer.toString(getHour())+":"+ Integer.toString(getMinute())+ ":" +Integer.toString(getSecond());
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
