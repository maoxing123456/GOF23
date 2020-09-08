package com.example.gof23.factorymethod;

import com.example.gof23.singlefactory.Audi;
import com.example.gof23.singlefactory.BWM;
import com.example.gof23.singlefactory.Car;

public class AudiFactory implements CarFactory{
    @Override
    public  Car createCar() {
        return new Audi();
    }
}
