package com.hellspear.dagger2practice.parts;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine(){

    }

    @Override
    public void start() {
        Log.d(TAG, "start: petrol engine started");
    }
}
