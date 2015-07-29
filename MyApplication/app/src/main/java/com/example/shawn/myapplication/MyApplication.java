package com.example.shawn.myapplication;

import android.app.Application;

import org.androidannotations.annotations.EApplication;

/**
 * Created by shawn on 15/7/27.
 */
@EApplication
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
