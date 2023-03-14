package com.example.myapp;

import static com.example.myapp.MainActivity.s;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        textView=findViewById(R.id.textView);
        textView.setText(s);
    }

    public void back(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}