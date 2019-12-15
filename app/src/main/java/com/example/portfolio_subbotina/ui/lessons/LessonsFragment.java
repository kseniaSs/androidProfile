package com.example.portfolio_subbotina.ui.lessons;

import android.os.Bundle;
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

public class LessonsFragment extends Fragment {

    private LessonsViewModel lessonsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        lessonsViewModel =
                ViewModelProviders.of(this).get(LessonsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_lessons, container, false);
        return root;
    }
}
