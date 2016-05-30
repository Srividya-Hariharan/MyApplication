package com.example.dell.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        a=a+1;
        TextView printNo = (TextView)findViewById(R.id.textView);
        printNo.setText(String.valueOf(a));

        if(a%5==0){
            LinearLayout currentLayout = (LinearLayout) findViewById(R.id.main);
            currentLayout.setBackgroundColor(Color.rgb(100, 150, 200));
        }
        if((a+1)%5==0){
            LinearLayout currentLayout = (LinearLayout) findViewById(R.id.main);
            currentLayout.setBackgroundColor(Color.rgb(100, 150, 100));
        }
        if((a-1)%5==0){
            LinearLayout currentLayout = (LinearLayout) findViewById(R.id.main);
            currentLayout.setBackgroundColor(Color.rgb(150, 100, 100));
        }

        if((a+2)%5==0){
            LinearLayout currentLayout = (LinearLayout) findViewById(R.id.main);
            currentLayout.setBackgroundColor(Color.rgb(200, 200, 250));
        }

        if((a-2)%5==0){
            LinearLayout currentLayout = (LinearLayout) findViewById(R.id.main);
            currentLayout.setBackgroundColor(Color.rgb(200, 100, 250));
        }
    }

    public void resetCounter(View v){
        a=0;
        TextView printNo = (TextView)findViewById(R.id.textView);
        printNo.setText(String.valueOf(a));
    }

}
