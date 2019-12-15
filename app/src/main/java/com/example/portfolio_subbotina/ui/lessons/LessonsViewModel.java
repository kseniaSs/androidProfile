package com.example.portfolio_subbotina.ui.lessons;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LessonsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LessonsViewModel() {
    }

    public LiveData<String> getText() {
        return mText;
    }
}
