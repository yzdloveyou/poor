package com.example.poor.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.poor.R;
import com.example.poor.Until.PinyinUtil;
import com.example.poor.adpter.ListLetterAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import me.yokeyword.fragmentation.SupportFragment;

public class Support_Fr_3_2 extends SupportFragment  {
ListView listView;
ListView letter;
    BaseAdapter baseAdapter1;
    List<String > letterlist=new ArrayList<>();
    private String[] letters = new String[]{"a", "b", "c", "d", "e",
            "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "w", "x", "y", "z","#"};
    String name[]={"亚瑟","吕布", "秋雅", "秋天", "球球", "张良", "孙尚香", "我", "你", "啊", "哈哈", "嘿"};
    public static Support_Fr_3_2 newInstance() {
        Bundle args = new Bundle();
        Support_Fr_3_2 fragment = new Support_Fr_3_2();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view4=inflater.inflate(R.layout.frag3_2,null);
        listView =(ListView)view4.findViewById(R.id.message);
        letter=(ListView)view4.findViewById(R.id.letter);
        addLetter(name);
        BaseAdapter baseAdapter= new BaseAdapter() {
            @Override
            public int getCount() {
                return letters.length;
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
                convertView = getLayoutInflater().from(getActivity()).inflate(R.layout.frag3_2item, parent, false);
                TextView textView=(TextView)convertView.findViewById(R.id.yyy3);
                textView.setText(letters[position]);
                return convertView;
            }
        };
        letter.setAdapter(baseAdapter);
        letter.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("letter","点击"+letters[position]);
                startPosition(letters[position]);
            }
        });
       baseAdapter1= new BaseAdapter() {
            @Override
            public int getCount() {
                return letterlist.size();
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
                convertView = getLayoutInflater().from(getActivity()).inflate(R.layout.frag3_2item2, parent, false);
                TextView textView=(TextView)convertView.findViewById(R.id.yyy3);
                textView.setText(letterlist.get(position));
                ListView listView=convertView.findViewById(R.id.listview);
                ListLetterAdapter listLetterAdapter=new ListLetterAdapter(getActivity(),getNames(letterlist.get(position)));
                setHeight(listLetterAdapter,listView);
                listView.setAdapter(listLetterAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Log.d("点击","你点击了"+position);
                    }
                });
                return convertView;
            }
        };
        listView.setAdapter(baseAdapter1);
        return view4;
    }
    public  void addLetter(String [] name){
        for (int i = 0; i <name.length ; i++) {
            if(!letterlist.contains(PinyinUtil.getFirstLetter(name[i]))){
                letterlist.add(PinyinUtil.getFirstLetter(name[i]));
            }
        }
    }
    public List<String> getNames(String letter){
        List<String> all=new ArrayList<>();
        for (int i = 0; i <name.length; i++) {
            if(PinyinUtil.getFirstLetter(name[i]).equals(letter)){
                all.add(name[i]);
            }
        }
        return all;
    }
    public void setHeight(BaseAdapter adapter,ListView listView){
        int height = 0;
        int count = adapter.getCount();
        for(int i=0;i<count;i++){
            View temp = adapter.getView(i,null,listView);
            temp.measure(0,0);
            height += temp.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.width = ViewGroup.LayoutParams.FILL_PARENT;
        params.height = height+count*3;
    }
    private  void startPosition(String newletter){
        //先找出点击的再哪一出位置
        for (int i = 0; i < letterlist.size(); i++) {
            if(letterlist.get(i).equals(newletter)){
                listView.smoothScrollToPosition(i);//刷新完后调转到第一条内容处
                break;
            }
        }
    }
}



