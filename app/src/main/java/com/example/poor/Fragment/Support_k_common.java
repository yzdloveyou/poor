package com.example.poor.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.poor.R;
import com.example.poor.adpter.CommonListAdapter;
import com.example.poor.adpter.NewsListAdapter;

public class Support_k_common extends Fragment {
    ListView listView;
    CommonListAdapter commonListAdapter;
    public static Support_k_common newInstance() {
        Bundle args = new Bundle();//Bundle是用来传递数据的“容器”
        Support_k_common fragment = new Support_k_common();
        fragment.setArguments(args);//官方推荐Fragment.setArguments(Bundle bundle)这种方式来传递参数
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view3 = inflater.inflate(R.layout.k_common,container,false);
        //对listview_news填充
        listView =(ListView)view3.findViewById(R.id.listview_common);
        commonListAdapter=new CommonListAdapter(getActivity());
        listView.setAdapter(commonListAdapter);
        return view3;
    }
}
