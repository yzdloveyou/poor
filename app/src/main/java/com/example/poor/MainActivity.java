package com.example.poor;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.poor.Fragment.Support_Fr_1;
import com.example.poor.Fragment.Support_Fr_2;
import com.example.poor.Fragment.Support_Fr_3;
import com.example.poor.Fragment.Support_Fr_4;

import me.yokeyword.fragmentation.SupportActivity;
import me.yokeyword.fragmentation.SupportFragment;

public class MainActivity extends SupportActivity implements View.OnClickListener {
    ViewGroup viewGroup[] = new ViewGroup[4];
    ImageView imageView[] = new ImageView[4];
    TextView textView[] = new TextView[4];
    private SupportFragment now_frag;
    private SupportFragment[] mFragments = new SupportFragment[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        imageView[0].setSelected(true);
        textView[0].setTextColor(Color.parseColor("#1296db"));
        mFragments[0] = Support_Fr_1.newInstance();
        mFragments[1] = Support_Fr_2.newInstance();
        mFragments[2] = Support_Fr_3.newInstance();
        mFragments[3] = Support_Fr_4.newInstance();
        now_frag = mFragments[0];
        loadRootFragment(R.id.fl_container, mFragments[0]);
    }

    private void init() {
        viewGroup[1] = findViewById(R.id.l2);
        viewGroup[2] = findViewById(R.id.l3);
        viewGroup[3] = findViewById(R.id.l5);
        viewGroup[0] = findViewById(R.id.l1);
        textView[0] = findViewById(R.id.t1);
        textView[1] = findViewById(R.id.t2);
        textView[2] = findViewById(R.id.t3);
        textView[3] = findViewById(R.id.t5);
        imageView[0] = findViewById(R.id.n1);
        imageView[1] = findViewById(R.id.n2);
        imageView[2] = findViewById(R.id.n3);
        imageView[3] = findViewById(R.id.n5);
        viewGroup[1].setOnClickListener(this);
        viewGroup[2].setOnClickListener(this);
        viewGroup[3].setOnClickListener(this);
        viewGroup[0].setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.l1:
                setTrue(0);
                break;
            case R.id.l2:
                setTrue(1);
                break;
            case R.id.l3:
                setTrue(2);
                break;
            case R.id.l5:
                setTrue(3);
                break;
            default:
                break;
        }
    }

    private void setTrue(int i) {
        for (int j = 0; j < 4; j++) {
            if (i != j) {
                imageView[j].setSelected(false);
                textView[j].setTextColor(Color.parseColor("#8a8a8a"));
            }
        }
        imageView[i].setSelected(true);
        textView[i].setTextColor(Color.parseColor("#1296db"));
        if (now_frag != mFragments[i]) {
            if (findFragment(mFragments[i].getClass())!= null) {
                showHideFragment(mFragments[i], now_frag);
            } else {
                start(mFragments[i]);
            }
            now_frag = mFragments[i];
        }
    }
}
