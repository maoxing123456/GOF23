package com.example.gof23.singlefactory;

import android.util.Log;

public class Audi implements Car {
    @Override
    public void run() {
        Log.e("Audi","奥迪再跑");
    }
}
