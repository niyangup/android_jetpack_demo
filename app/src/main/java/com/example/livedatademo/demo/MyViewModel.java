package com.example.livedatademo.demo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> number;

    public MutableLiveData<Integer> getNumber() {
        if (number == null) {
            number = new MutableLiveData<>(0);
        }
        return number;
    }


    public void addNumber() {
        number.setValue(number.getValue() + 1);
    }

    public void reduceNumber() {
        number.setValue(number.getValue() - 1);
        if (number.getValue() < 0) {
            number.setValue(0);
        }
    }
}