package com.example.android_e_commerce.ui.management;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.android_e_commerce.databinding.FragmentProductManagementBinding;

public class ProductManagementFragment extends Fragment {

    private FragmentProductManagementBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProductManagementViewModel slideshowViewModel =
                new ViewModelProvider(this).get(ProductManagementViewModel.class);

        binding = FragmentProductManagementBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textProductsManagement;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}