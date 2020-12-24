package com.example.livedatademo.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import android.os.Bundle;
import android.util.Log;

import com.example.livedatademo.R;

/**
 * 感知生命周期
 */
public class DemoActivity extends AppCompatActivity implements LifecycleObserver {

    private static final String TAG = "DemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        getLifecycle().addObserver(this);
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void logNow() {
        Log.d(TAG, "ON_PAUSE: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void logNow2() {
        Log.d(TAG, "ON_RESUME: ");
    }
}