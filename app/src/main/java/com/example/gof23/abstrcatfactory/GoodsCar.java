package com.example.gof23.abstrcatfactory;

public class GoodsCar implements CarFactory{
    @Override
    public Engine createEngine() {
        return new GoodsCarEngine();
    }

    @Override
    public Seat createSeat() {
        return new GoodsCarSeat();
    }
}
