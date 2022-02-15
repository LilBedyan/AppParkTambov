package com.example.myapplication.ui.skidki;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentSkidkiBinding;

public class SkidkiFragment extends Fragment {

    private FragmentSkidkiBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SkidkiViewModel skidkiViewModel =
                new ViewModelProvider(this).get(SkidkiViewModel.class);

        binding = FragmentSkidkiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSkidki;
        skidkiViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
