package com.example.gof23.danlie;
/*
单列模式 懒汉式
 */
public class SingleDeme2 {
    //1私有构造器
    private SingleDeme2(){}

    //2.创建静态实例 懒汉式
    private static SingleDeme2 instance2;
    //暴露公告方法

    //懒汉式 要使用同步块
    public static synchronized SingleDeme2 getInstance(){
        if (instance2 != null) {
           instance2=new SingleDeme2();
        }
        return instance2;
    }
}
