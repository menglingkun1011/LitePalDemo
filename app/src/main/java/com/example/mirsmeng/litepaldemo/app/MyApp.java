package com.example.mirsmeng.litepaldemo.app;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

/**
 * Created by MirsMeng on 2017/11/10.
 */

public class MyApp extends LitePalApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
