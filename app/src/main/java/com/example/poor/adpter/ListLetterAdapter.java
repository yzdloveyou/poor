package com.example.poor.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.poor.R;

import java.util.List;


public class ListLetterAdapter extends BaseAdapter {
    Context context;
    List<String> name;
    public ListLetterAdapter(Context context1, List<String> name) {
        context=context1;
        this.name=name;
    }

    @Override
    public int getCount() {
        return name.size();
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
        View view1= LayoutInflater.from(context).inflate(R.layout.frag3_2item3,viewGroup,false);
        TextView textView=(TextView)view1.findViewById(R.id.yyy3);
        textView.setText(name.get(i));
        return view1;
    }
}
