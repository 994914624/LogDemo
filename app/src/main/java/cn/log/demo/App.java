package cn.log.demo;

import android.app.Application;

import cn.log.demo.library.LogcatUtil;

/**
 * Created by yzk on 2018/10/29
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 抓调试日志
        LogcatUtil.getInstance(this).init();
    }
}
