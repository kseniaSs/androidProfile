package com.example.portfolio_subbotina.ui.contact;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> linkedInText;

    public ContactViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Напишите мне в <a href='https://vk.com/s_sksenia'>Vkontakte</a>");
        linkedInText = new MutableLiveData<>();
        linkedInText.setValue("Напишите мне в <a href='https://www.linkedin.com/in/%D0%BA%D1%81%D0%B5%D0%BD%D0%B8%D1%8F-%D1%81%D1%83%D0%B1%D0%B1%D0%BE%D1%82%D0%B8%D0%BD%D0%B0-644893198/'>LinkedIn</a>");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getLinkedInText() {
        return linkedInText;
    }
}
