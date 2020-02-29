package com.example.poor.adpter;

import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentPagerAdapter_k extends FragmentPagerAdapter {
    private FragmentManager myfragmaneger;
    private List<Fragment> mylist;

    public FragmentPagerAdapter_k(FragmentManager fm, List<Fragment> list){
        super(fm);
        this.mylist = list;
    }

    public void setPrimaryItem(ViewGroup container,int position,Object object){
        super.setPrimaryItem(container,position,object);
    }

    public Fragment getItem(int arg0){
        return mylist.get(arg0);
    }

    public  int getCount(){
        return mylist.size();
    }

}
