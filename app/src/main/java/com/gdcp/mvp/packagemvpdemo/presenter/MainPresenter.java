package com.gdcp.mvp.packagemvpdemo.presenter;

import com.gdcp.mvp.packagemvpdemo.base.BasePresenter;
import com.gdcp.mvp.packagemvpdemo.contract.MainContract;
import com.gdcp.mvp.packagemvpdemo.model.MainModel;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter{
    private MainContract.Model model;

    public MainPresenter() {
        model = new MainModel();
    }


    @Override
    public void getGirls(int page) {
        if (!isViewAttached()) {
            return;
        }
        mView.get().showLoading();
        mView.get().onLoadGirlSuccess(model.loadGirl(page));
        mView.get().hideLoading();

    }
}
