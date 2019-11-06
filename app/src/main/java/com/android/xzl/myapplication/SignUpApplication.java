package com.android.xzl.myapplication;

import android.app.Application;
import android.content.Context;


/**
 * Created by wulei on 2019/9/29.
 */
public class SignUpApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        this.mContext = getApplicationContext();

    }



    public static Context getAppContext(){

        return mContext;
    }
}
