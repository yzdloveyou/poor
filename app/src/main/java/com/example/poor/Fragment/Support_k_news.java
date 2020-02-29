package com.example.poor.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.poor.R;
import com.example.poor.adpter.NewsListAdapter;

public class Support_k_news extends Fragment {
    ListView listView;
    NewsListAdapter newsListAdapter;

    public static Support_k_news newInstance() {
        Bundle args = new Bundle();//Bundle是用来传递数据的“容器”
        Support_k_news fragment = new Support_k_news();
        fragment.setArguments(args);//官方推荐Fragment.setArguments(Bundle bundle)这种方式来传递参数
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //这个view由k_news布局填充
        View view1 = inflater.inflate(R.layout.k_news,null);
        //对listview_news填充
        listView =(ListView)view1.findViewById(R.id.listview_news);
        newsListAdapter=new NewsListAdapter(getActivity());
        listView.setAdapter(newsListAdapter);
        return view1;
    }
}

