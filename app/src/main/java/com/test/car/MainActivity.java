package com.test.car;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Car car = null;
    TextView txtTank;
    TextView txtWeight;
    TextView txtWidth;
    TextView txtHeight;
    TextView txtTakhometre;
    TextView txtvinCode;
    TextView txtMark;


    static String text = "";

    public static int A_PLUS_B(int a,int b){
        Math.random();
        return a + b;
    }



    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        car = new Car(4,80.0f,2500,1500,3500,"VAZ");

        Truck truck = new Truck();





        car.setHeight(1500);
        car.setWidth(5500);
        truck.setMark("Mercedess");

        Motorcycle motorcycle =new Motorcycle(2,50.0f,2000,1325,765,"VAZ");

        Jeep jeep = new Jeep();
        jeep.setHeight(1500);




        txtTank = findViewById(R.id.txtTank);
        txtWeight = findViewById(R.id.txtWeight);
        txtWidth = findViewById(R.id.txtWidth);
        txtHeight = findViewById(R.id.txtHeight);
        txtTakhometre = findViewById(R.id.txtTakhometre);
        txtvinCode = findViewById(R.id.txtvinCode);
        txtMark = findViewById(R.id.txtMark);


        txtTank.setText("Tank =" + car.getTank());
        txtWeight.setText("Weight =" + car.getWeight());
        txtWidth.setText("Width =" + car.getWidth());
        txtHeight.setText("Height =" + car.getHeight());
        txtTakhometre.setText("Takhometre =" + car.getTakhometre());
        txtvinCode.setText("vinCode =" + car.getVinCode());
        txtMark.setText("Mark =" + car.getMark());

        car.startEngine();
        car.stopEngine();

        car.startEngine();
        car.accelerate(5);
        car.accelerate(10);
        car.accelerate(10);
        car.accelerate(10);
        car.accelerate(10);
        car.decelerate(30);
        car.decelerate(30);
        car.fill(40);




    }
}