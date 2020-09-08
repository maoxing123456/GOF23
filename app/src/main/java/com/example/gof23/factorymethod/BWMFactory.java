package com.example.gof23.factorymethod;

import com.example.gof23.singlefactory.BWM;
import com.example.gof23.singlefactory.Car;

public class BWMFactory  implements CarFactory{
    @Override
    public  Car createCar() {
        return new BWM();
    }
}
