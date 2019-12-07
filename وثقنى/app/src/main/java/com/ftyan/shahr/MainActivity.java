package com.ftyan.shahr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ScrollView ly1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ly1=(ScrollView) findViewById(R.id.lay1);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Random random=new Random();

        int red=random.nextInt(100);
        int green=random.nextInt(100);
        int blue=random.nextInt(100);
        ly1.setBackgroundColor(Color.argb(80,red,green,blue));


    }

    public void btn1_next(View v) {
        Intent intent = new Intent(MainActivity.this, riqure.class);
        startActivity(intent);
    }
        public void btn2_next(View v) {
            Intent intent = new Intent(MainActivity.this, info_shahr.class);
            startActivity(intent);
    }
     public void btn3_next(View v) {
            Intent intent = new Intent(MainActivity.this, complaint.class);
            startActivity(intent);
    }
     public void btn4_next(View v) {
            Intent intent = new Intent(MainActivity.this, Maps.class);
            startActivity(intent);
    }


    public void btn5_next(View v) {
        Intent intent = new Intent(MainActivity.this, service1.class);
        startActivity(intent);
    }

    public void btn6_next(View v) {
        Intent intent = new Intent(MainActivity.this, service2.class);
        startActivity(intent);
    }
    public void btn7_next(View v) {
        Intent intent = new Intent(MainActivity.this, service3.class);
        startActivity(intent);
    }

    public void btn8_next(View v) {
        Intent intent = new Intent(MainActivity.this, service4.class);
        startActivity(intent);
    }

    public void btn9_next(View v) {
        Intent intent = new Intent(MainActivity.this, service5.class);
        startActivity(intent);
    }

    public void btn10_next(View v) {
        Intent intent = new Intent(MainActivity.this, service6.class);
        startActivity(intent);
    }

    public void btn11_next(View v) {
        Intent intent = new Intent(MainActivity.this, service7.class);
        startActivity(intent);
    }

    public void btn12_next(View v) {
        Intent intent = new Intent(MainActivity.this, service8.class);
        startActivity(intent);
    }

    public void btn13_next(View v) {
        Intent intent = new Intent(MainActivity.this, service9.class);
        startActivity(intent);
    }

    public void btn14_next(View v) {
        Intent intent = new Intent(MainActivity.this, service10.class);
        startActivity(intent);
    }

    public void btn15_next(View v) {
        Intent intent = new Intent(MainActivity.this, service11.class);
        startActivity(intent);
    }

    public void btn16_next(View v) {
        Intent intent = new Intent(MainActivity.this, service12.class);
        startActivity(intent);
    }

    public void btn17_next(View v) {
        Intent intent = new Intent(MainActivity.this, service13.class);
        startActivity(intent);
    }

    public void btn18_next(View v) {
        Intent intent = new Intent(MainActivity.this, service14.class);
        startActivity(intent);
    }
}
