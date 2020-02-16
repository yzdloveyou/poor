package com.example.poor.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import me.yokeyword.fragmentation.SupportFragment;

public class Support_Fr_2 extends SupportFragment  {

    public static Support_Fr_2 newInstance() {
        Bundle args = new Bundle();
        Support_Fr_2 fragment = new Support_Fr_2();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }
}



