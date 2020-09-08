package com.example.gof23.danlie;
/*
单列模式 静态内部类 懒汉式
优点：线程安全 延迟加载
 */
public class SingleDeme3 {
    //1私有构造器
    private SingleDeme3(){}

    //2.创建静态内部类实例 懒汉式
    private static class Single{
        private static final SingleDeme3 singleDeme3=new SingleDeme3();
    }
    //暴露公告方法

    public static SingleDeme3 getInstance(){
        return Single.singleDeme3;
    }
}
