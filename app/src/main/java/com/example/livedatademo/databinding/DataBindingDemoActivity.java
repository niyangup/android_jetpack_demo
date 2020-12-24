package com.example.livedatademo.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.livedatademo.R;

public class DataBindingDemoActivity extends AppCompatActivity {

    ActivityDataBindingDemoBinding binding;
    DataBindingViewModel dataBindingViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_demo);
        dataBindingViewModel = ViewModelProviders.of(this).get(DataBindingViewModel.class);
        binding.setModel(dataBindingViewModel);
        binding.setLifecycleOwner(this);
    }
}