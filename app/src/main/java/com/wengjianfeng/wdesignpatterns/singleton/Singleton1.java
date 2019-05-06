package com.wengjianfeng.wdesignpatterns.singleton;

import android.util.Log;

/**
 * 饿汉单例模式
 */
public class Singleton1 {
    private static final String TAG = Singleton1.class.getSimpleName();

    private static Singleton1 singleton1 = new Singleton1();
    private Singleton1(){}

    public static Singleton1 getInstance(){
        return singleton1;
    }

    public void doSomething(int i){
        Log.w(TAG, i+"_ 饿汉式加载doSomething: ..."+singleton1.toString());
    }


}
