package com.wengjianfeng.wdesignpatterns.observable;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * 开发者-观察者
 */
public class Coder implements Observer {
    public static final String TAG = Coder.class.getSimpleName();

    public String name;

    public Coder(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        Log.e(TAG, "hi "+this.name+" 有新的文章更新了，更新内容："+arg);
    }


    @Override
    public String toString() {
        return "coder name:"+this.name;
    }
}
