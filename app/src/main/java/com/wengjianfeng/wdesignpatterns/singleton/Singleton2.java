package com.wengjianfeng.wdesignpatterns.singleton;

import android.util.Log;

/**
 * 懒汉模式单例
 */
public class Singleton2 {
    private static final String TAG = Singleton2.class.getSimpleName();

    private volatile static Singleton2 singleton2;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if (singleton2 == null){
            synchronized (Singleton2.class){
                if (singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }

    public void donSomething(int i){
        Log.e(TAG,i+"= 懒汉式加载dosomething..."+singleton2.toString());
    }
}
