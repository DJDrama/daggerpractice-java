package com.hellspear.dagger2practice;

import android.util.Log;

import com.hellspear.dagger2practice.parts.Engine;
import com.hellspear.dagger2practice.parts.Wheels;

import javax.inject.Inject;

//https://www.youtube.com/watch?v=wJkHYBf8VkA&list=PLrnPJCHvNZuA2ioi4soDZKz8euUQnJW65&index=2
public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) { //dagger should know engine and wheels depencies
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive(){
        Log.d(TAG, "driving...");
    }
}
