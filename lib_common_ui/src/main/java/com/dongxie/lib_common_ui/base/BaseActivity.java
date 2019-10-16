package com.dongxie.lib_common_ui.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.dongxie.lib_common_ui.uitils.StatusBarUtil;

/**
 * @ClassName: BaseActivity
 * @Description:
 * @Author: dongxie
 * @CreateDate: 2019/10/16 13:07
 */
public class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.statusBarLightMode(this);
    }
}
