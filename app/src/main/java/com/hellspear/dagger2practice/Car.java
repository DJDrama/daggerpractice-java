package com.hellspear.dagger2practice;

import android.util.Log;

import com.hellspear.dagger2practice.parts.Engine;
import com.hellspear.dagger2practice.parts.Remote;
import com.hellspear.dagger2practice.parts.Wheels;

import javax.inject.Inject;

//https://www.youtube.com/watch?v=wJkHYBf8VkA&list=PLrnPJCHvNZuA2ioi4soDZKz8euUQnJW65&index=2
public class Car {
    private static final String TAG = "Car";

    //engine and wheels are dependency of CAR
    @Inject Engine engine; //Field
    private Wheels wheels;

    @Inject //-> let dagger provide this dependency(Constructor Injection)
    public Car(Engine engine, Wheels wheels) { //dagger should know engine and wheels depencies
        this.engine = engine;
        this.wheels = wheels;
    }

    //Method
    @Inject //Dagger does this. calls after the constructor method. Shouldn't be private-> Dagger cannot call this
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        engine.start();
        Log.d(TAG, "driving...");
    }
}
