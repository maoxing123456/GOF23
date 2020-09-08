package com.example.gof23.danlie;
/*
单列模式 饿汉式
 */
public class SingleDeme1 {
    //1私有构造器
    private SingleDeme1(){
        //扩张：防反射
        if (instance1 != null) {
            throw new RuntimeException();
        }
    }

    //2.创建静态实例 饿汉式
    private static SingleDeme1 instance1=new SingleDeme1();
    //线程安全  不需要使用同步块
    //暴露公告方法
    public static SingleDeme1 getInstance(){
        return instance1;
    }
}
