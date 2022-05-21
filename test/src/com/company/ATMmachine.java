package com.company;

public class ATMmachine {
    int pin ;
    String state = "LOCKED";
    int money;

    public ATMmachine(int pin,int money) {
        this.pin = pin;
        this.money =money;
    }

    boolean validatePin(int p){
    if(isLocked()) {
        if (p == pin) {
            state = "WAITING";
            return true;
        }
    }
    return false;
    }
    boolean withdraw(int m){
        if(! isLocked()) {
            if (containsMoney(m)) {
                this.money -= m;
                return true;
            }
        }
        return false;
    }

    boolean deposit(int m){
        if (! isLocked()) {
            this.money += m;
            return true;
        }
        else return false;
    }

    boolean isLocked(){
        return state == "LOCKED";
    }
    boolean containsMoney(int m){
        if(isLocked())
            return false;
        return money>m;
    }

    void exit(){
        if(isLocked())
            state ="LOCKED";
    }
}
