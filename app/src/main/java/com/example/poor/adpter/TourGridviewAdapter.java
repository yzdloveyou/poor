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
 //   String colors[]={"#BAA3E9","#C2A9F3","#84BFEE","#B9E48D","#F8CA87","#ACD7EB"};
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
        TextView textView = (TextView) view1.findViewById(R.id.text);//text是wangge2中TextView的id
        ViewGroup viewGroup1=(ViewGroup) view1.findViewById(R.id.l1);//l1是wangge2的id
        ImageView imageView=(ImageView)view1.findViewById(R.id.image);//image是wangge2中ImageView的id
    //    viewGroup1.setBackgroundColor(Color.parseColor(colors[i]));//设定每个方框的颜色用setBackgroundColor方法，Color类中的praseColor方法
        textView.setText(a[i]);//设定方框的文字
        imageView.setImageResource(images[i]);//设定方框里的图片里面的形参都是数组？
//            Glide.with(context).load(url[i]).into(imageView);
//View，ViewGroup，Color是系统类，
        return view1;
    }
}
