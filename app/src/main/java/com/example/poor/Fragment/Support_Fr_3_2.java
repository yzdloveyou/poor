package com.example.poor.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.poor.R;

import me.yokeyword.fragmentation.SupportFragment;

public class Support_Fr_3_2 extends SupportFragment  {

    public static Support_Fr_3_2 newInstance() {
        Bundle args = new Bundle();
        Support_Fr_3_2 fragment = new Support_Fr_3_2();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view4=inflater.inflate(R.layout.soupport3_2,null);
        return view4;
    }
}



