package com.hellspear.dagger2practice;

import com.hellspear.dagger2practice.parts.Engine;
import com.hellspear.dagger2practice.parts.Wheels;

public class Car {
    Engine engine;
    Wheels wheels;

    Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    void drive() {

    }
}
