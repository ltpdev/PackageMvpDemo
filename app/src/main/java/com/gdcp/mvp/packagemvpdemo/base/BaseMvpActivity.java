package com.gdcp.mvp.packagemvpdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseMvpActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView{
   protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        presenter=createPresenter();
        presenter.attachView(this);
        initData();
    }

    protected abstract int getLayoutId();

    protected abstract void initData();

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
