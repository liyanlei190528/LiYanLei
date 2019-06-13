package com.example.a41845.liyanlei.adapter;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.example.a41845.liyanlei.Main3Activity;

import java.util.ArrayList;

public class VpAdapter extends PagerAdapter {
    private final Main3Activity main3Activity;
    private final ArrayList<View> views;

    public VpAdapter(Main3Activity main3Activity, ArrayList<View> views) {

        this.main3Activity = main3Activity;
        this.views = views;
    }
    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }
     @NonNull
         @Override
         public Object instantiateItem(@NonNull ViewGroup container, int position) {
             View view = views.get(position);
             container.addView(view);
             return view;
         }

         @Override
         public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
             container.removeView(views.get(position));
         }
}
