package com.gdcp.mvp.packagemvpdemo.model;

import com.gdcp.mvp.packagemvpdemo.bean.Girl;
import com.gdcp.mvp.packagemvpdemo.contract.MainContract;

import java.util.ArrayList;
import java.util.List;

public class MainModel implements MainContract.Model{

    @Override
    public List<Girl> loadGirl(int page) {
        List<Girl> girls=new ArrayList<>();
        for (int i = 0; i < page; i++) {
            girls.add(new Girl(10+i,"张三"+i));
        }
        return girls;
    }
}
