package com.example.fragmentlisthomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements IInputFragment{
    MainFragment mainFragment;
    InputFragment inputFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mainFragment = (MainFragment) fragmentManager.findFragmentById(R.id.recycler_fragment);
        inputFragment = (InputFragment) fragmentManager.findFragmentById(R.id.input_fragment);
        inputFragment.listener = this;



    }


    @Override
    public void onInputNumber(int number) {
        mainFragment.fullList(number);
    }

    @Override
    public void forResult(String result) {
        Log.d("ololo",result);
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("key",result);
        startActivity(intent);
    }



}
