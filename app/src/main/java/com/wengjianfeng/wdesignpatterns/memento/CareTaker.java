package com.wengjianfeng.wdesignpatterns.memento;

/**
 * 负责管理Memoto
 */
public class CareTaker {

    Memoto memoto;

    /**
     * 归档
     * @param memoto
     */
    public void archive(Memoto memoto){
        this.memoto = memoto;
    }

    /**
     * 获取存档
     * @return
     */
    public Memoto getMemoto(){
        return this.memoto;
    }
}
