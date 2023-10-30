package com.example.android_e_commerce.ui.management;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProductManagementViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ProductManagementViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Product Management fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}