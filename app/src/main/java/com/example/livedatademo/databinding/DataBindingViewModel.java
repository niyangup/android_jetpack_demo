package com.example.livedatademo.databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataBindingViewModel extends ViewModel {
    private MutableLiveData<Integer> data;

    public MutableLiveData<Integer> getData() {
        if (data == null) {
            data = new MutableLiveData<>(0);
        }
        return data;
    }

    public void addData() {
        data.setValue(data.getValue() + 2);
    }
}
