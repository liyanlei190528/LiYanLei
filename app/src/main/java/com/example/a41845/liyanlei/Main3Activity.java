package com.example.a41845.liyanlei;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a41845.liyanlei.adapter.VpAdapter;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    private ViewPager mVp;
    /**
     * xxx
     */
    private TextView mTv;
    private ArrayList<View> views;
    private VpAdapter vpAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();
    }

    private void initView() {
        mVp = (ViewPager) findViewById(R.id.vp);
        mTv = (TextView) findViewById(R.id.tv);

        Intent intent = getIntent();
        int poistion = intent.getIntExtra("poistion", 0);

        views = new ArrayList<>();

        views = new ArrayList<>();
                         for (int i = 0; i <views.size() ; i++) {
                             View view =View.inflate(this,R.layout.item,null);
                             ImageView image = view.findViewById(R.id.iv);
                                 image.setImageResource(poistion);
                             views.add(view);
                         }vpAdapter = new VpAdapter(this, views);
                         mVp.setAdapter(vpAdapter);

    }
}
