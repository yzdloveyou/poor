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

public class Support_Fr_3_2 extends SupportFragment  {
ListView listView;
    public static Support_Fr_3_2 newInstance() {
        Bundle args = new Bundle();
        Support_Fr_3_2 fragment = new Support_Fr_3_2();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view4=inflater.inflate(R.layout.collect,null);
        listView =(ListView)view4.findViewById(R.id.collect_listview);
        BaseAdapter baseAdapter= new BaseAdapter() {
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
                convertView = getLayoutInflater().from(getActivity()).inflate(R.layout.collect_item, parent, false);
                return convertView;
            }
        };
        listView.setAdapter(baseAdapter);
        return view4;
    }
}



