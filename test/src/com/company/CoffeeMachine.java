package com.company;

public class CoffeeMachine {
    int money =0;

    public CoffeeMachine() {
    }

    public CoffeeMachine(int money) {
        this.money = money;
    }

    void inc(){
        money++;
    }
    boolean dec(){
        if(containsMoney()){
            money--;
            return true;
        }
        return false;
    }
    boolean containsMoney(){
        return money>0;
    }

    boolean getCoffee(){

        if(containsMoney()){
            dec();
            return true;
        }
        return false;
    }

}
