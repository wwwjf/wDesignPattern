package com.wengjianfeng.wdesignpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wengjianfeng.wdesignpatterns.singleton.Singleton1;
import com.wengjianfeng.wdesignpatterns.singleton.Singleton2;
import com.wengjianfeng.wdesignpatterns.singleton.Singleton3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        1、饿汉模式
        for (int i = 0; i < 10; i++) {
            Singleton1.getInstance().doSomething(i);
        }
//        2、懒汉模式
        for (int i = 0; i < 10; i++) {
            Singleton2.getInstance().donSomething(i);
        }
//        3、静态内部类加载
        for (int i = 0; i < 10; i++) {
            Singleton3.getInstance().doSomething(i);
        }
//        4、容器实现
    }
}
