package com.example.poor.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.poor.R;

import me.yokeyword.fragmentation.SupportFragment;

public class Support_Fr_3 extends SupportFragment implements View.OnClickListener {
    private SupportFragment nowFragment;
    TextView message;
    TextView tongxun;
    private SupportFragment[] mFragments = new SupportFragment[2];
    public static Support_Fr_3 newInstance() {
        Bundle args = new Bundle();
        Support_Fr_3 fragment = new Support_Fr_3();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFragments[0]=Support_Fr_3_1.newInstance();
        mFragments[1]=Support_Fr_3_2.newInstance();
        nowFragment=mFragments[0];
        View view3=inflater.inflate(R.layout.frag3,null);
        init(view3);
        if(findFragment(nowFragment.getClass())==null){
            loadMultipleRootFragment(R.id.fragme,0,mFragments[0],mFragments[1]);
        }
        return view3;
    }
    public void init(View view){
        tongxun=view.findViewById(R.id.tongxun);
        message=view.findViewById(R.id.message);
        tongxun.setOnClickListener(this);
        message.setOnClickListener(this);
        tongxun.setTextColor(Color.parseColor("#8a8a8a"));
        message.setTextColor(Color.parseColor("#ffffff"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tongxun:
                if(nowFragment!=mFragments[1]){
                    showHideFragment(mFragments[1],nowFragment);
                    nowFragment=mFragments[1];
                }
                tongxun.setTextColor(Color.parseColor("#ffffff"));
                message.setTextColor(Color.parseColor("#8a8a8a"));
                break;
            case R.id.message:
                if(nowFragment!=mFragments[0]){
                    showHideFragment(mFragments[0],nowFragment);
                    nowFragment=mFragments[0];
                }
                tongxun.setTextColor(Color.parseColor("#8a8a8a"));
                message.setTextColor(Color.parseColor("#ffffff"));
                break;
                default:
                    break;
        }
    }
}



