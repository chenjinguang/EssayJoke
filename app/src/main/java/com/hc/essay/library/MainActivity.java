package com.hc.essay.library;

import android.view.View;

import com.example.administrator.framelibrary.BaseSkinActivity;
import com.example.administrator.framelibrary.DefaultNavigationBar;


public class MainActivity extends BaseSkinActivity implements View.OnClickListener {

    @Override
    protected void initData() {

    }


    @Override
    protected void initView() {
        // 初始化View
        viewById(R.id.test_tv).setOnClickListener(this);
    }

    @Override
    protected void initTitle() {
        DefaultNavigationBar navigationBar = new
                DefaultNavigationBar.Builder(this)
                .setTitle("投稿")
                .builder();
    }

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

    }
}

