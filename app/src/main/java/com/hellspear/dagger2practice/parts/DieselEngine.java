package com.hellspear.dagger2practice.parts;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public DieselEngine(){

    }

    @Override
    public void start() {
        Log.d(TAG, "start: diesel engine started");
    }
}
