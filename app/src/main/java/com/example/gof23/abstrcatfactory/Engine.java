package com.example.gof23.abstrcatfactory;

import android.util.Log;

public interface Engine {
    void  run();
}

class GoodsCarEngine implements  Engine{
    @Override
    public void run() {
        Log.e("好的发动机","磨损小");
    }
}
