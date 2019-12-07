package com.ftyan.shahr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class info_shahr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_shahr);

        final Button button1   =findViewById(R.id.button1);
        final TextView textView1 = findViewById(R.id.textView1);
        final Button  button2   =findViewById(R.id.button2);
        final TextView textView2 = findViewById(R.id.textView2);
        final Button  button3   =findViewById(R.id.button3);
        final TextView textView3= findViewById(R.id.textView3);
        final Button  button4   =findViewById(R.id.button4);
        final TextView textView4 = findViewById(R.id.textView4);
        final Button  button5   =findViewById(R.id.button5);
        final TextView textView5 = findViewById(R.id.textView5);



        button1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView1.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView2.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView3.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView4.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                visible=!visible;
                textView5.setVisibility(visible?View.VISIBLE:View.GONE);
            }
        });

    }
}
