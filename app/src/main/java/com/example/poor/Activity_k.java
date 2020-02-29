package com.example.poor;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.poor.Fragment.Support_k_common;
import com.example.poor.Fragment.Support_k_laws;
import com.example.poor.Fragment.Support_k_news;
import com.example.poor.R;
import com.example.poor.adpter.FragmentPagerAdapter_k;

import java.util.ArrayList;
import java.util.List;

public class Activity_k extends AppCompatActivity {
    private List<Fragment> list;
    private ViewPager myViewPager;
    private FragmentPagerAdapter_k adapter;

    private TextView text_news;
    private TextView text_laws;
    private TextView text_common;


    protected void onCreate(Bundle savedInstanceState) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knowledge_p);
        initView();
    }

    private void initView() {
        text_news = (TextView)findViewById(R.id.text_news);
        text_laws = (TextView)findViewById(R.id.text_laws);
        text_common = (TextView)findViewById(R.id.text_common);
        //viewPager
        myViewPager = (ViewPager)findViewById(R.id.viewpager);
        //fragment添加到list里，
        list = new ArrayList<>();
        list.add(new Support_k_news());
        list.add(new Support_k_laws());
        list.add(new Support_k_common());
        //初始化ViewPager
        adapter = new FragmentPagerAdapter_k(getSupportFragmentManager(), list);
        myViewPager.setAdapter(adapter);//设置适配器
        myViewPager.addOnPageChangeListener(new MyPagerChangeListener());
        myViewPager.setCurrentItem(1);//初始化第一个界面
    }

    public class MyPagerChangeListener extends AppCompatActivity implements  ViewPager.OnPageChangeListener{

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int arg0) {
            switch(arg0)
            {
                case 0:
                    text_news.setTextColor(Color.WHITE);
                    text_laws.setTextColor(Color.BLACK);
                    text_common.setTextColor(Color.BLACK);
                    text_news.setBackgroundResource(R.drawable.bg_circle_brown);
                    text_laws.setBackground(null);
                    text_common.setBackground(null);
                    break;
                case 1:
                    text_news.setTextColor(Color.BLACK);
                    text_laws.setTextColor(Color.WHITE);
                    text_common.setTextColor(Color.BLACK);
                    text_news.setBackground(null);
                    text_laws.setBackgroundResource(R.drawable.bg_circle_brown);
                    text_common.setBackground(null);
                    break;
                case 2:
                    text_news.setTextColor(Color.BLACK);
                    text_laws.setTextColor(Color.BLACK);
                    text_common.setTextColor(Color.WHITE);
                    text_news.setBackground(null);
                    text_laws.setBackground(null);
                    text_common.setBackgroundResource(R.drawable.bg_circle_brown);
                    break;
            }

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    }
}
