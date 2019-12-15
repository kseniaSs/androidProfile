package com.example.portfolio_subbotina.ui.contact;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.portfolio_subbotina.R;

public class ContactFragments extends Fragment {

    private ContactViewModel contactViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        contactViewModel =
                ViewModelProviders.of(this).get(ContactViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contact, container, false);
        final TextView linkView = root.findViewById(R.id.vk_url);
        contactViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                linkView.setText(Html.fromHtml(s));
                linkView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });
        final TextView linkedInView = root.findViewById(R.id.linkedin_url);
        contactViewModel.getLinkedInText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                linkedInView.setText(Html.fromHtml(s));
                linkedInView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });
        return root;
    }
}

