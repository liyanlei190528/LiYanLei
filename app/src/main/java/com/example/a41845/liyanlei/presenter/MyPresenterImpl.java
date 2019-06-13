package com.example.a41845.liyanlei.presenter;

import com.example.a41845.liyanlei.bean.RootBean;
import com.example.a41845.liyanlei.callback.MyCallBack;
import com.example.a41845.liyanlei.model.MyModel;
import com.example.a41845.liyanlei.view.MyView;

public class MyPresenterImpl implements MyPresenter, MyCallBack {
    private MyModel myModel;
    private MyView myView;

    public MyPresenterImpl(MyModel myModel, MyView myView) {
        this.myModel = myModel;
        this.myView = myView;
    }

    @Override
    public void getDate() {
        if (myModel!=null){
            myModel.getDate(this);
        }
    }

    @Override
    public void onSuccess(RootBean rootBean) {
        if (myView!=null){
            myView.onSuccess(rootBean);
        }
    }

    @Override
    public void onFild(String msg) {
        if (myView!=null){
            myView.onFild(msg);
        }
    }
}
