package com.avborik28.animation_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = "tag";
                Log.i( tag,"hello world");

               // txtHelloWorld.animate().rotation(87f).setDuration(1000);
                //txtHelloWorld.animate().rotation(0f).setDuration(2000);
                txtHelloWorld.animate().scaleX(87f).setDuration(1000);
            }
        });
    }
}
