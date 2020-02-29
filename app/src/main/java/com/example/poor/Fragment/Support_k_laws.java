package com.example.poor.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.poor.R;
import com.example.poor.adpter.LawsListAdapter;
import com.example.poor.adpter.NewsListAdapter;

public class Support_k_laws extends Fragment {
    ListView listView;
    LawsListAdapter lawsListAdapter;
    public static Support_k_laws newInstance() {
        Bundle args = new Bundle();//Bundle是用来传递数据的“容器”
        Support_k_laws fragment = new Support_k_laws();
        fragment.setArguments(args);//官方推荐Fragment.setArguments(Bundle bundle)这种方式来传递参数
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view2 = inflater.inflate(R.layout.k_laws,null);
        //对listview_news填充
        listView =(ListView)view2.findViewById(R.id.listview_laws);
        lawsListAdapter=new LawsListAdapter(getActivity());
        listView.setAdapter(lawsListAdapter);
        return view2;
    }
}
