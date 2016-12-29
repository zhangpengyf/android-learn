package com.learn.android;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by zhangpeng on 12/29/16.
 */

public class FirstActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(android.R.layout.first_layout);
    }
}
