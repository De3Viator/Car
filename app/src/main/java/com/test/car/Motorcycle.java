package com.test.car;

public class Motorcycle extends Car {

    public Motorcycle(int count, float tankFull, int weight, int height, int width, String mark) {
        super(2, tankFull, weight, height, width, mark);

        MainActivity.text ="STATIC VOID";
        int summ = MainActivity.A_PLUS_B(0,2);
    }
}
