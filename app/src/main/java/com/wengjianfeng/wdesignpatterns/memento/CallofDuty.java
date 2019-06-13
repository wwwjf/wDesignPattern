package com.wengjianfeng.wdesignpatterns.memento;

/**
 * 使命召唤
 */
public class CallofDuty {

    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    /**
     * 玩游戏
     */
    public void play() {
        System.out.println("玩游戏：" + String.format("第%d关奋战杀敌中", mCheckpoint));
        mLifeValue -= 10;
        System.out.println("进度升级啦");
        mCheckpoint++;
        System.out.println("到达" + String.format("第%d关", mCheckpoint));
    }

    /**
     * 退出游戏
     */
    public void quit() {
        System.out.println("----------");
        System.out.println("退出前的游戏属性：" + this.toString());
        System.out.println("退出游戏");
        System.out.println("----------");
    }


    /**
     * 创建备忘录
     * @return
     */
    public Memoto createMemoto(){
        Memoto memoto = new Memoto();
        memoto.mCheckpoint = mCheckpoint;
        memoto.mlifeValue = mLifeValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }

    public void restore(Memoto memoto){

        this.mCheckpoint = memoto.mCheckpoint;
        this.mLifeValue = memoto.mlifeValue;
        this.mWeapon = memoto.mWeapon;
        System.out.println("恢复后的游戏属性："+this.toString());
    }


    @Override
    public String toString() {
        return "CallofDuty{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
