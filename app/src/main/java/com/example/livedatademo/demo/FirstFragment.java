package com.example.livedatademo.demo;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import com.example.livedatademo.R;
import com.example.livedatademo.databinding.FirstFragmentBinding;

public class FirstFragment extends Fragment {

    private static final String TAG = "FirstFragment";
    private MyViewModel mViewModel;
    private FirstFragmentBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.first_fragment, container, false);
        mViewModel = ViewModelProviders.of(getActivity()).get(MyViewModel.class);
        binding.setModel(mViewModel);
        binding.setLifecycleOwner(getActivity());
        binding.textView5.setText(String.valueOf(mViewModel.getNumber()));
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        binding.seekBar.setProgress(mViewModel.getNumber().getValue());
        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                binding.textView5.setText(String.valueOf(progress));
                mViewModel.getNumber().setValue(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        binding.button5.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment));
    }

}