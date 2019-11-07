package com.hellspear.dagger2practice;

import android.util.Log;

import com.hellspear.dagger2practice.parts.Engine;
import com.hellspear.dagger2practice.parts.Remote;
import com.hellspear.dagger2practice.parts.Wheels;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    //engine and wheels are dependency of CAR
    private Engine engine; //Field
    private Wheels wheels;
    private Driver driver;

    @Inject //-> let dagger provide this dependency(Constructor Injection)
    public Car(Driver driver, Engine engine, Wheels wheels) { //dagger should know engine and wheels depencies
        this.driver=driver;
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
        Log.d(TAG, driver + " " + driver.name + " drives " + this);
    }
}
