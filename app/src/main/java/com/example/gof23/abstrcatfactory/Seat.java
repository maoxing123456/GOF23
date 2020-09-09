package com.example.gof23.abstrcatfactory;

import android.util.Log;

public interface Seat {
    void  sleep();
}
class GoodsCarSeat implements Seat{

    @Override
    public void sleep() {
        Log.e("GoodsCar","座椅舒服");
    }
}
