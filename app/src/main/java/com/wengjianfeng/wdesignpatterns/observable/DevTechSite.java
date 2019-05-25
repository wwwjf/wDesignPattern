package com.wengjianfeng.wdesignpatterns.observable;

import java.util.Observable;

/**
 * 被观察者-开发技术网站
 */
public class DevTechSite extends Observable {

    public void postNewContent(String content){
        //内容发生变化
        setChanged();
        //通知所有的观察者
        notifyObservers(content);
    }
}
