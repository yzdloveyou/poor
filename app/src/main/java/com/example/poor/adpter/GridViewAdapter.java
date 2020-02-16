package com.example.poor.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.poor.R;


public class GridViewAdapter extends BaseAdapter {
    Context context;
    String a[] = {"第一书记", "贫困人口", "贫困人口分布", "联邦到户干部", "已完成项目", "进行中的项目"};
    String b[] = {"67人", "132人", "135个村", "650人", "4项", "16项"};

    public GridViewAdapter(Context context1) {
        context = context1;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = LayoutInflater.from(context).inflate(R.layout.wangge, null);
        TextView textView = (TextView) view1.findViewById(R.id.yyy4);
        TextView textView1 = (TextView) view1.findViewById(R.id.yyy3);
        textView.setText(a[i]);
        textView1.setText(b[i]);
//            Glide.with(context).load(url[i]).into(imageView);

        return view1;
    }
}
