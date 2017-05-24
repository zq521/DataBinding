package com.example.zhaoqiang.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.zhaoqiang.databinding.databinding.ActivityMainBinding;

/**
 * 邮箱：727319870@qq.com
 * Created by ${轩韩子} on 2017/5/24.10:27
 * 在这个类操作所有MainActivity的布局
 */

public class Presenter {
    private Context context;

    private ActivityMainBinding binding;

    public Presenter(ActivityMainBinding binding, Context context) {
        this.binding = binding;
        this.context = context;
        binding.setUser(new User("xiaoming"));
        binding.setPresenter(this);
//         binding.tvOut.setText("Helo World");//通过ID设置
//        binding.btnClick.setOnClickListener(new View.OnClickListener() {//点击事件
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getContext(), "Button clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    public Context getContext() {
        return context;
    }

    public ActivityMainBinding getBinding() {
        return binding;
    }

    public void btnClickMeHandler(View v){
        Toast.makeText(getContext(), "Button clicked", Toast.LENGTH_SHORT).show();
    }

    public void btnClicked(String words){
        Toast.makeText(getContext(), words, Toast.LENGTH_SHORT).show();
    }
}
