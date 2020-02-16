package com.example.poor.adpter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.poor.R;


public class TourGridviewAdapter extends BaseAdapter {
    Context context;
    String a[] = {"注册", "申请", "创业", "活动展开", "知识普及", "金融"};
    int images[] = {R.drawable.tour1, R.drawable.tour2, R.drawable.tour3, R.drawable.tour4, R.drawable.tour5, R.drawable.tour6};
    String colors[]={"#BAA3E9","#C2A9F3","#84BFEE","#B9E48D","#F8CA87","#ACD7EB"};
    public TourGridviewAdapter(Context context1) {
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
        View view1 = LayoutInflater.from(context).inflate(R.layout.wangge2, viewGroup,false);
        TextView textView = (TextView) view1.findViewById(R.id.text);
        ViewGroup viewGroup1=(ViewGroup) view1.findViewById(R.id.l1);
        ImageView imageView=(ImageView)view1.findViewById(R.id.image);
        viewGroup1.setBackgroundColor(Color.parseColor(colors[i]));
        textView.setText(a[i]);
        imageView.setImageResource(images[i]);
//            Glide.with(context).load(url[i]).into(imageView);

        return view1;
    }
}
