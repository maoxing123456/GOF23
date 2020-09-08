package com.example.gof23.danlie;

import android.util.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
：反射和反序列化 破解单列模式
 */
public class SingleDeme5 {
    public void test() throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
//        //放射的写法
//        Class<SingleDeme1> clazz= (Class<SingleDeme1>) Class.forName("com.example.shejimoshi.danlie.SingleDeme1");
//
//        Constructor<SingleDeme1> c=clazz.getDeclaredConstructor(null);
//
//        c.setAccessible(true);
//
//        SingleDeme1 s1=c.newInstance();
//        SingleDeme1 s2=c.newInstance();
//        Log.e("SingleDeme5",s1+"");
//        Log.e("SingleDeme5",s2+"");

        //通过反序列化的方式构造多个对象
        FileOutputStream fos=new FileOutputStream("d/a.text");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.close();
        fos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d/a.text"));
        SingleDeme6 s3 = (SingleDeme6) ois.readObject();
        Log.e("s3",s3.hashCode()+"");

    }

}
