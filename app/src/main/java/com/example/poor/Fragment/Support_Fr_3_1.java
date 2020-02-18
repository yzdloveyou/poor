package com.example.poor.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.poor.R;

import me.yokeyword.fragmentation.SupportFragment;

public class Support_Fr_3_1 extends SupportFragment  {
ListView listView;
    public static Support_Fr_3_1 newInstance() {
        Bundle args = new Bundle();
        Support_Fr_3_1 fragment = new Support_Fr_3_1();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view4=inflater.inflate(R.layout.soupport3_1,null);
        listView=(ListView)view4.findViewById(R.id.listview);//前面的ListView是声明的对象，后面的listview是该Fragment中listview的关联XML内容
        BaseAdapter baseAdapter=new BaseAdapter() {
            @Override
            public int getCount() {
                return 2;
            }//适配器中数据集 中 数据的个数

            @Override
            public Object getItem(int position) {
                return null;
            }//获取数据集 中 与 指定索引 对应的 数据项

            @Override
            public long getItemId(int position) {
                return 0;
            }//获取指定行对应的ID

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                convertView=LayoutInflater.from(getActivity()).inflate(R.layout.sou3_1_item,parent,false);
                return convertView;
            }//获取每一个Item的显示内容
            //上面四个方法是BaseAdapter需要重写的方法
        };
        listView.setAdapter(baseAdapter);
        return view4;
    }
}



