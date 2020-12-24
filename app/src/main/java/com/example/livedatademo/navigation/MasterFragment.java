package com.example.livedatademo.navigation;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.livedatademo.R;

public class MasterFragment extends Fragment {

    private static final String TAG = "MasterFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_master, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getView().findViewById(R.id.button3).setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_masterFragment_to_detailFragment);
        });
    }
}