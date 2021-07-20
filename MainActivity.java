package com.ch.a04_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView) findViewById(R.id.textView);
        textView2 =(TextView) findViewById(R.id.textView2);
        textView.setText("");

        textView.setText("Boo!");
        textView2.setText("Buy another copy of this book");
//        shout("Help");
//        shout("I'm trapped inside a smartphone");
//        shout();
//        shout("Put down the phone and start living life", "*");
    }
     void shout(String message){
        textView.append(message);
        textView.append("!!! ");
     }

    void shout(){

        textView.append("!!!!!!!");
    }

    void shout(String message, String emphasis){
        textView.append(message);
        textView.append(emphasis);
        textView.append(emphasis);
        textView.append(emphasis);
    }
}
