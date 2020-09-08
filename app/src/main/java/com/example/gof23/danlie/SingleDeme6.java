package com.example.gof23.danlie;

import java.io.Serializable;

/*
单列模式 饿汉式
 */
//实现serializable接口 防止反序列化
public class SingleDeme6 implements Serializable {
    //1私有构造器
    private SingleDeme6(){
        //扩张：防反射
        if (instance1 != null) {
            throw new RuntimeException();
        }
    }

    //2.创建静态实例 饿汉式
    private static SingleDeme6 instance1=new SingleDeme6();
    //线程安全  不需要使用同步块
    //暴露公告方法
    public static SingleDeme6 getInstance(){
        return instance1;
    }
}
