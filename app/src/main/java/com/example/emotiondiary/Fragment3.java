package com.example.emotiondiary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.View;

//import android.support.annotation.Nullable;

public class Fragment3 extends Fragment {
    //Fragment of month_view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.month_view, container, false);
    }
}