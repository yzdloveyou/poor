package com.example.poor.Fragment;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import com.example.poor.R;
import com.example.poor.adpter.GridViewAdapter;
import com.example.poor.adpter.ListFirstAdapter;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import me.yokeyword.fragmentation.SupportFragment;

public class Support_Fr_1 extends SupportFragment implements OnBannerListener {

    Banner mBanner;
    GridView gridView;
    ListView listView;
    public static Support_Fr_1 newInstance() {
        Bundle args = new Bundle();
        Support_Fr_1 fragment = new Support_Fr_1();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag1,null);
        mBanner = view.findViewById(R.id.banner);
        gridView=view.findViewById(R.id.grd2);
        listView=view.findViewById(R.id.main_list);
        LoadingBanner();
        mBanner.startAutoPlay();//开始轮播
        //设置网格
        setWangge();
        //加载list
//        setList();
        return view;
    }
    public void setWangge() {
        GridViewAdapter gridViewAdapter=new GridViewAdapter(getActivity());
        gridView.setAdapter(gridViewAdapter);
    }
    private void setList(){
        ListFirstAdapter listFirstAdapter=new ListFirstAdapter(getActivity());
        listView.setAdapter(listFirstAdapter);
    }
    public void LoadingBanner() {
        //图片资源
        int[] imageResourceID = new int[]{R.drawable.poor1,R.drawable.poor2, R.drawable.poor3, R.drawable.poor4};
        List<Integer> imgeList = new ArrayList<>();
        //轮播标题
        String[] mtitle = new String[]{"国家扶贫项目开启", "我爱就业", "做大做强", "生活就是这样"};
        List<String> titleList = new ArrayList<>();

        for (int i = 0; i < imageResourceID.length; i++) {
            imgeList.add(imageResourceID[i]);//把图片资源循环放入list里面
            titleList.add(mtitle[i]);//把标题循环设置进列表里面
            //设置图片加载器，通过Glide加载图片
            mBanner.setImageLoader(new ImageLoader() {
                @Override
                public void displayImage(Context context, Object path, ImageView imageView) {
                    Glide.with(getActivity()).load(path).into(imageView);
                }
            });
            //设置轮播的动画效果,里面有很多种特效,可以到GitHub上查看文档。
            mBanner.setBannerAnimation(Transformer.Default);
            mBanner.setImages(imgeList);//设置图片资源
            mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);//设置banner显示样式（带标题的样式）
            mBanner.setBannerTitles(titleList); //设置标题集合（当banner样式有显示title时）
            //设置指示器位置（即图片下面的那个小圆点）
            mBanner.setIndicatorGravity(BannerConfig.CENTER);
            mBanner.setDelayTime(1500);//设置轮播时间3秒切换下一图
            mBanner.setOnBannerListener(this);//设置监听
            mBanner.start();//开始进行banner渲染
        }
    }
    @Override
    public void OnBannerClick(int position) {
        System.out.println("你点击了轮播图");
    }

    public static String getAppVersionName(Context context) {
        String versionName=null;
        try {
            PackageManager pm = context.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
            versionName = pi.versionName;
        } catch (Exception e) {
        }
        return versionName;
    }

}
