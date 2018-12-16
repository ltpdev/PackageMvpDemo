package com.gdcp.mvp.packagemvpdemo.base;
/*基本的显示层接口*/
public interface BaseView {
    //显示加载中
    void showLoading();
    //隐藏加载
    void hideLoading();
    //获取数据失败
    void onError(Throwable throwable);
}
