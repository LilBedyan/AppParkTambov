package com.example.myapplication.ui.personal_info;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PersonalInfoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PersonalInfoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is personal info fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}