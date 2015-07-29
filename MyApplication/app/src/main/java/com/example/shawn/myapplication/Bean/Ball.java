package com.example.shawn.myapplication.Bean;

import android.content.Context;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

/**
 * Created by shawn on 15/7/27.
 */
@EBean(scope = EBean.Scope.Singleton)
public class Ball {
    //    public Ball(String color){
//        this.color=color;
//    }
    @RootContext
    Context context;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
