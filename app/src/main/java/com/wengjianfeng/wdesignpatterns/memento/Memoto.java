package com.wengjianfeng.wdesignpatterns.memento;

public class Memoto {

    public int mCheckpoint;
    public int mlifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memoto{" +
                "mCheckpoint=" + mCheckpoint +
                ", mlifeValue=" + mlifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
