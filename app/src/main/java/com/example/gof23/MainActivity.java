package com.example.gof23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.gof23.abstrcatfactory.CarFactory;
import com.example.gof23.abstrcatfactory.Engine;
import com.example.gof23.abstrcatfactory.GoodsCar;
import com.example.gof23.abstrcatfactory.Seat;
import com.example.gof23.factorymethod.AudiFactory;
import com.example.gof23.factorymethod.BWMFactory;
import com.example.gof23.singlefactory.Audi;
import com.example.gof23.singlefactory.Car;
import com.example.gof23.singlefactory.SingleFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }public void c1(View view) throws NoSuchMethodException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException, ClassNotFoundException {
//        SingleDeme5 s5=new SingleDeme5();
//        s5.test();
  }
  public void c2(View view) throws NoSuchMethodException, IllegalAccessException, InstantiationException, IOException, InvocationTargetException, ClassNotFoundException {
//        SingleDeme5 s5=new SingleDeme5();
//        s5.test();
   }
   public void c3(View view){
       Car c1=SingleFactory.getCar("宝马");
       Car c2=SingleFactory.getCar("奥迪");
       c1.run();
       c2.run();

   }
    public void c4(View view){
       Car c1= new BWMFactory().createCar();
       Car c2= new AudiFactory().createCar();
        c1.run();
        c2.run();
    }
    public void c5(View view){
        CarFactory factory=new GoodsCar();
        Engine engine = factory.createEngine();
        Seat seat = factory.createSeat();
        engine.run();
        seat.sleep();

    }
    public void c6(View view){

    }
    public void c7(View view){

    }

}