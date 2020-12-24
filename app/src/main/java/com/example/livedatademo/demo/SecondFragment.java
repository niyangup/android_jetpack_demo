package com.example.livedatademo.demo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.livedatademo.R;
import com.example.livedatademo.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private static final String TAG = "SecondFragment";
    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false);
        MyViewModel model = ViewModelProviders.of(getActivity()).get(MyViewModel.class);
        binding.setModel(model);
        binding.setLifecycleOwner(getActivity());
        binding.textView6.setText(String.valueOf(model.getNumber()));

        binding.button8.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.navigate(R.id.action_secondFragment_to_firstFragment);
        });
        return binding.getRoot();
    }

}