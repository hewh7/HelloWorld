package com.example.helloworld;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LifeCycleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("LifeCyle","----onCreate----");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCyle","----onStart----");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCyle","----onResume----");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCyle","----onPause----");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCyle","----onStop----");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCyle","----onRestart----");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCyle","----onDestroy----");
    }
}
