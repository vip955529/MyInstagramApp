package com.example.myinstagramapp.ui.like;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LikeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LikeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Like fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
