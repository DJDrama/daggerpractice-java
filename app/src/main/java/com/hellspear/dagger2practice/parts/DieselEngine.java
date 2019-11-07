package com.hellspear.dagger2practice.parts;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;

    @Inject
    public DieselEngine(int hp){
        this.horsePower=hp;
    }

    @Override
    public void start() {
        Log.d(TAG, "start: diesel engine started. Horsepower: " + horsePower);
    }
}
