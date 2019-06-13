package com.example.a41845.liyanlei;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.a41845.liyanlei.adapter.MyAdapter;
import com.example.a41845.liyanlei.bean.RootBean;
import com.example.a41845.liyanlei.model.MyModelImpl;
import com.example.a41845.liyanlei.presenter.MyPresenterImpl;
import com.example.a41845.liyanlei.view.MyView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements MyView {

    private Toolbar mTool;
    private RecyclerView mRv;
    private ArrayList<RootBean.ResultBean> list;
    private MyAdapter myAdapter;
    private MyPresenterImpl myPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        initDate();
    }

    private void initDate() {
        myPresenter = new MyPresenterImpl(new MyModelImpl(), this);
        myPresenter.getDate();
    }

    private void initView() {
        mTool = (Toolbar) findViewById(R.id.tool);
        mRv = (RecyclerView) findViewById(R.id.rv);

        list = new ArrayList<>();
        myAdapter = new MyAdapter(this, list);
        mRv.setAdapter(myAdapter);
        mRv.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    public void onSuccess(RootBean rootBean) {
        List<RootBean.ResultBean> result = rootBean.getResult();
        list.addAll(result);
        myAdapter.notifyDataSetChanged();

        myAdapter.setOnClick(new MyAdapter.OnClick() {
            @Override
            public void onItem(int position, RootBean.ResultBean resultBean) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra("poistion",position);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onFild(String msg) {
        Toast.makeText(this, ""+msg, Toast.LENGTH_SHORT).show();
    }
}
