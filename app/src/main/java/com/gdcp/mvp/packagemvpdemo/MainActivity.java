package com.gdcp.mvp.packagemvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.gdcp.mvp.packagemvpdemo.base.BaseMvpActivity;
import com.gdcp.mvp.packagemvpdemo.bean.Girl;
import com.gdcp.mvp.packagemvpdemo.contract.MainContract;
import com.gdcp.mvp.packagemvpdemo.presenter.MainPresenter;

import java.util.List;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.View{


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        presenter.getGirls(10);
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public void onLoadGirlSuccess(List<Girl> girls) {
             for (Girl girl:girls){
                 Log.i("girl",girl.getName());
             }
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError(Throwable throwable) {

    }
}
