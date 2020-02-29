package com.example.poor.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.poor.R;

public class LawsListAdapter extends BaseAdapter {
    Context context;
    int image1[]={R.drawable.poor3,R.drawable.poor2};
    int image2[]={R.drawable.tour1,R.drawable.tour2};
    String text1[]={"上海环球港，将商业，旅游，文化的功能都全面基于其独具特殊的购物环境","上海环球港，将商业，旅游，文化的功能都全面基于其独具特殊的购物环境" };
    String text2[]={"探讨新文旅发展 布局新产业未来","成长为一个合格的APP" };
    public LawsListAdapter(Context context1) {
        context=context1;
    }
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //关联item
        View view = LayoutInflater.from(context).inflate(R.layout.k_laws_item,parent,false);
        //关联id
        ImageView imageView1 =(ImageView)view.findViewById(R.id.image1_laws);
        ImageView imageView2 = (ImageView)view.findViewById(R.id.image2_laws);
        TextView textView = (TextView)view.findViewById(R.id.text2_laws);

        imageView1.setImageResource(image1[position]);
        imageView2.setImageResource(image2[position]);
        textView.setText(text1[position]);
        textView.setText(text2[position]);//position就是数组中的位置

        return view;
    }
}
