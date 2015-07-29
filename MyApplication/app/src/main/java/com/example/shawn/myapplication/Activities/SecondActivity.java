package com.example.shawn.myapplication.Activities;

import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.shawn.myapplication.R;

import org.androidannotations.annotations.AfterExtras;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_second)
public class SecondActivity extends ActionBarActivity {
    @Extra
    String color;
    @ViewById(R.id.color)
    TextView tv_color;

    @AfterViews
    void init2(){
        tv_color.setText(color);
    }



}
