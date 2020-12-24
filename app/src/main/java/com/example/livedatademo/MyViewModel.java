package com.example.livedatademo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> count;

    public MutableLiveData<Integer> getCount() {
        if (count == null) {
            count = new MutableLiveData<>(0);
        }
        return count;
    }

    public void addCount() {
        count.setValue(count.getValue() + 1);
    }
}
