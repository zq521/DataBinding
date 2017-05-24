package com.example.zhaoqiang.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhaoqiang.databinding.databinding.ActivityMainBinding;

/**
 * 把Presenter绑定到MainActivity中
 */
public class MainActivity extends AppCompatActivity {
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        presenter = new Presenter(binding, this);

//        ActivityMainBinding binding1 = DataBindingUtil.setContentView(this, R.layout.activity_base);
//        presenter = new Presenter(binding1,this);


    }
}
