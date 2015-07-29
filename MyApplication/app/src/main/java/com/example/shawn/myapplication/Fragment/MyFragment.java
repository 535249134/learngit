package com.example.shawn.myapplication.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.TextView;

import com.example.shawn.myapplication.Activities.SecondActivity_;
import com.example.shawn.myapplication.Bean.Ball;
import com.example.shawn.myapplication.MyApplication;
import com.example.shawn.myapplication.R;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.App;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.Trace;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.api.BackgroundExecutor;

/**
 * Created by shawn on 15/7/27.
 */
@EFragment(R.layout.fragment_one)
public class MyFragment extends Fragment {
    public static String TAG = "MyFragment";
    @Bean
    Ball ball;
    @ViewById(R.id.text_hello)
    TextView helloText;
    @App
    MyApplication application;

    @Click
    void btn_change() {
        SecondActivity_.intent(getActivity()).color(ball.getColor()).start();
    }

    @AfterInject
    void calledAfterInjection() {
        ball.setColor("RED");
        Log.v(this.getClass().getName(), "AfterInject");
        testTrack("test");

    }

    @Trace(tag="MyFragment",level = Log.VERBOSE)
    private void testTrack(String s) {
        //do sth...
    }

    @AfterViews
    void calledAfterViewInjection() {

        Log.v(this.getClass().getName(), "AfterViews");
        for (int i = 0; i < 100; i++) {
            doInback(i);
        }
        //BackgroundExecutor.cancelAll("back",true);

    }

    @Background(serial = "")
    void doInback(int i) {
        SystemClock.sleep(100);
        //Log.v(TAG, i + "");
    }

}
