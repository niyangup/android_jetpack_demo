package com.example.livedatademo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    private MyViewModel myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        textView.setText(String.valueOf(myViewModel.getCount()));

        button.setOnClickListener(v -> myViewModel.addCount());

        myViewModel.getCount().observe(this, integer -> {
            textView.setText(String.valueOf(integer));
        });
    }
}