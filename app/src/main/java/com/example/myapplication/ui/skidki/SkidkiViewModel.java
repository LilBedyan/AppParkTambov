package com.example.myapplication.ui.skidki;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SkidkiViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SkidkiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is skidki fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}