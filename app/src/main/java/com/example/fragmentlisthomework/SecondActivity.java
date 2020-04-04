package com.example.fragmentlisthomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;

public class SecondActivity extends AppCompatActivity {
String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        FragmentManager fragmentManager = getSupportFragmentManager();
        SecondFragment secondFragment= (SecondFragment) fragmentManager.findFragmentById(R.id.text_view_fragment);
////        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
////        fragmentTransaction.replace(R.id.container, new SecondFragment());
////        fragmentTransaction.commit();
////

        Intent intent = getIntent();
            result = intent.getStringExtra("key");
            secondFragment.setText(result);


    }
}
