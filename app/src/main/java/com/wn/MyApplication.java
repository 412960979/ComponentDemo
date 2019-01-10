package com.wn;

import android.app.Application;
import com.wn.component.Component;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化ARoute
        Component.init(this, true);
    }
}
