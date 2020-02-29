package com.example.poor.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.example.poor.Activity_k;
import com.example.poor.R;
import com.example.poor.adpter.TourGridviewAdapter;

import me.yokeyword.fragmentation.SupportFragment;

public class Support_Fr_2 extends SupportFragment  {
    GridView gridView;
TourGridviewAdapter tourGridviewAdapter;//自建的adpter
    public static Support_Fr_2 newInstance() {
        Bundle args = new Bundle();//Bundle是用来传递数据的“容器”
        Support_Fr_2 fragment = new Support_Fr_2();
        fragment.setArguments(args);//官方推荐Fragment.setArguments(Bundle bundle)这种方式来传递参数
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view2=inflater.inflate(R.layout.frag2,null);
       gridView=(GridView)view2.findViewById(R.id.grid);
       tourGridviewAdapter=new TourGridviewAdapter(getActivity());//getActivity是Fragment类中的方法（官方）
        gridView.setAdapter(tourGridviewAdapter);//设置适配器
        //点击事件
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {//position是被点击的格子的索引
                switch (position) {
                    case 4:
                        startActivity(new Intent(getActivity(), Activity_k.class));//启动另一个Activity
                        break;
                    default:
                        break;
                }
            }
        });
        return view2;
    }
}




