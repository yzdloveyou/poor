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
    String a[] = {"已完成项目", "进行中的项目","扶贫地区统计"};
    String b[] = { "4项", "16项","16个"};
int bg[]={R.drawable.yuan,R.drawable.yuan1,R.drawable.yuan2};
    public GridViewAdapter(Context context1) {
        context = context1;
    }

    @Override
    public int getCount() {
        return 3;
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
        textView1.setBackground(context.getResources().getDrawable(bg[i]));
//            Glide.with(context).load(url[i]).into(imageView);

        return view1;
    }
}
