package com.gdcp.mvp.packagemvpdemo.base;

import java.lang.ref.WeakReference;

public class BasePresenter<V extends BaseView>{
    //弱引用
    protected WeakReference<V>mView;

    //绑定view层引用
    public void attachView(V view){
        mView=new WeakReference<>(view);
    }


    //解除绑定view
    public void detachView(){
        if (mView!=null){
            mView.clear();
        }
    }

    //view失否绑定
    public boolean isViewAttached(){
        if (mView!=null&&mView.get()!=null){
            return true;
        }
        return false;
    }


}
