package com.gdcp.mvp.packagemvpdemo.contract;

import com.gdcp.mvp.packagemvpdemo.base.BaseView;
import com.gdcp.mvp.packagemvpdemo.bean.Girl;

import java.util.List;

public interface MainContract {
    interface Model{
        List<Girl> loadGirl(int page);
    }
    interface View extends BaseView{
        void onLoadGirlSuccess(List<Girl> girls);
    }
    interface Presenter {
        void getGirls(int page);
    }

}
