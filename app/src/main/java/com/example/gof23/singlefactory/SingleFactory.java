package com.example.gof23.singlefactory;
/*
简单工厂类，实现调用于被调用者之间的分离
 */
public class SingleFactory {
    public static Car getCar(String type) {
        if (type.equals("奥迪")) {
            return new Audi();
        }else if(type.equals("宝马")){
            return new BWM();
        }else {
            return null;
        }

    }
}
