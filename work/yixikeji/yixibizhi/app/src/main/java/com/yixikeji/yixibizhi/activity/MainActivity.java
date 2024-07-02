package com.yixikeji.yixibizhi.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MotionEvent;

import com.yixikeji.yixibizhi.R;

import androidx.annotation.Nullable;

public class MainActivity extends BaseActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
