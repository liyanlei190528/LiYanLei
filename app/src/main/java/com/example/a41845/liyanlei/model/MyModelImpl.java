package com.example.a41845.liyanlei.model;

import com.example.a41845.liyanlei.api.MyServer;
import com.example.a41845.liyanlei.bean.RootBean;
import com.example.a41845.liyanlei.callback.MyCallBack;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyModelImpl implements MyModel {
    @Override
    public void getDate(final MyCallBack callBack) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(MyServer.url)
                .build();
        MyServer myServer = retrofit.create(MyServer.class);
        Observable<RootBean> getdate = myServer.getdate();
        getdate.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RootBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(RootBean rootBean) {
                        if(callBack!=null){
                            callBack.onSuccess(rootBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        if(callBack!=null){
                            callBack.onFild(e.getMessage());
                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
