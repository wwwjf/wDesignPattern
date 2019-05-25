package com.wengjianfeng.wdesignpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.wengjianfeng.wdesignpatterns.observable.Coder;
import com.wengjianfeng.wdesignpatterns.observable.DevTechSite;
import com.wengjianfeng.wdesignpatterns.singleton.Singleton1;
import com.wengjianfeng.wdesignpatterns.singleton.Singleton2;
import com.wengjianfeng.wdesignpatterns.singleton.Singleton3;
import com.wengjianfeng.wdesignpatterns.strategy.BusStrategy;
import com.wengjianfeng.wdesignpatterns.strategy.SubwayStrategy;
import com.wengjianfeng.wdesignpatterns.strategy.TrafficStrategy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //单例模式
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


        //策略模式

        TrafficStrategy traffic1 = new TrafficStrategy(new BusStrategy());
        traffic1.calculatePrice(20);
        TrafficStrategy traffic2 = new TrafficStrategy(new SubwayStrategy());
        traffic2.calculatePrice(20);

        Toast.makeText(this, "二十公里：公交："+traffic1.calculatePrice(20)+",地铁："+traffic2.calculatePrice(20), Toast.LENGTH_SHORT).show();


        //观察者模式

        //被观察者
        DevTechSite site = new DevTechSite();
        //观察者
        Coder coder01 = new Coder("coder-01");
        Coder coder02 = new Coder("coder-02");
        Coder coder03 = new Coder("coder-03");

        //注册观察者到被观察者的观察列表中
        site.addObserver(coder01);
        site.addObserver(coder02);
        site.addObserver(coder03);


        //被观察者状态变化
        site.postNewContent("2019-05-25周报更新啦");


    }
}
