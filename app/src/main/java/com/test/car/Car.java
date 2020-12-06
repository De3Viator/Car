package com.test.car;

public class Car  {
    private int speed = 0;
    private float tankFull;
    private float tank = 80;
    private short takhometre;
    private int weight;
    private int width;
    private int height;
    private long vinCode;
    private float temperature = 25.0f;
    private String mark;
    private int count;
    private boolean isEngine;
    private int carBelt;

    public Car() {

    }


    public Car(int count, float tankFull, int weight, int height, int width,String mark){
        this.tankFull = tankFull;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.mark = mark;
        this.count = count;
    }


    public short getTakhometre() {
        return takhometre;
    }

    public long getVinCode() {
        return vinCode;
    }

    public String getMark() {
        return mark;
    }

    public int getWidth() {
        return width;
    }

    public float getTank(){
        return tank;
    }

    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth (int width){
        this.width = width;
    }

    public void setMark (String mark){
        this.mark = mark;
    }





    void startEngine() {
        if (tank > 0 && tank == 0) {
            isEngine = true;
        } else if (isEngine) {
            System.out.println("Car is already running");
        }
        System.out.println("Car is running");


    }

    void stopEngine() {
        isEngine = false;
        System.out.println("Car is stop");

    }

    private boolean isTemperatureNormal(){
        return temperature>10 && temperature<98;
    }

    private boolean isCarBeltNormal(){
        return carBelt>20 && carBelt < 120;

    }


    void accelerate(int velocity) {
        if (!isEngine) return;
        if (tank <= 0) {
            speed = 0;
            stopEngine();
            return;
        }
        speed += velocity;
        System.out.println("Ваша скорость теперь =" + speed);

        tank --;
        speed += velocity;
        temperature++;
        System.out.println("Теперь ваша скорость равна" + speed);

        speed --;
        speed += velocity;
        carBelt++;
        System.out.println("Теперь ваша скорость равна" + carBelt);
    }



    void decelerate(int velocity) {
        if ((speed - velocity) <= 0) {
            speed = 0;
        } else {
            speed =-velocity;
        }
        stopEngine();
        return;
    }

   void fill(int fuel) {
        if (tank <= tankFull) {
            tank = tankFull;
            System.out.println("Вы заполнили бак полностью");
        }
        else if (tank < tankFull){
            tank += fuel;
            System.out.println("Вы заполнили бак на " + tank);
        }
        else {

            tank += tankFull/2;
            System.out.println("Вы заправились на половину бака");
        }

    }
}
