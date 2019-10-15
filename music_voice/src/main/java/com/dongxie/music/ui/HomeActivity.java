package com.dongxie.music.ui;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.dongxie.music.R;

/**
 * @author dongxie
 */
public class HomeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        initData();
    }

    private void initView() {

    }

    private void initData() {
    }
}
