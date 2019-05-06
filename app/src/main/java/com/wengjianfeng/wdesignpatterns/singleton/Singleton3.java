package com.wengjianfeng.wdesignpatterns.singleton;

import android.util.Log;

/**
 * 静态内部类单例模式
 * 内部静态类不会自动初始化，只有调用静态内部类的方法、静态域或构造方法时才会加载静态内部类
 */
public class Singleton3 {
    private static final String TAG = Singleton3.class.getSimpleName();

    private Singleton3(){}

    public static Singleton3 getInstance(){
        return SingletonHolder.SINGLETON_3;
    }

    public void doSomething(int i){
        Log.e(TAG, i+"- 静态内部类加载模式doSomething: "+SingletonHolder.SINGLETON_3);
    }

    private static class SingletonHolder{
        private static final Singleton3 SINGLETON_3 = new Singleton3();
    }

}
