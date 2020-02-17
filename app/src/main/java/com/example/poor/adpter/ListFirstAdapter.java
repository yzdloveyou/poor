package com.example.poor.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.poor.R;


public class ListFirstAdapter extends BaseAdapter {
    Context context;
    String times[]={"2019.10.12","2010.10.12"};
    int images[]={R.drawable.poor1,R.drawable.poor2};
    String tests[]={"扶贫是帮助贫困户的合法权益","取消贫困负担。政府帮助贫困地区加大人才开发、完善农民工人才市场"};
    public ListFirstAdapter(Context context1) {
        context=context1;
    }

    @Override
    public int getCount() {
        return 2;
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
        View view1= LayoutInflater.from(context).inflate(R.layout.frag1_list,viewGroup,false);
        TextView textView=(TextView)view1.findViewById(R.id.text);
        ImageView imageView=(ImageView)view1.findViewById(R.id.image);
        TextView time=(TextView)view1.findViewById(R.id.time);
        textView.setText(tests[i]);
        imageView.setImageResource(images[i]);
        time.setText(times[i]);
        return view1;
    }
}
