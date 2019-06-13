package com.example.a41845.liyanlei;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;
//李艳雷  1810A  230811199005283238
public class MainActivity extends AppCompatActivity {

    /**
     * 欢迎来到北京积云教育
     */
    private TextView mTv;
    private Timer timer;
    private int time = 3;

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 10){
                time--;
                if (time == 0){
                    timer.cancel();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTv = (TextView) findViewById(R.id.tv);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(10);
            }
        },500,1000);

    }
}
