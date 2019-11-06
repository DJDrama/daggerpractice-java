package com.hellspear.dagger2practice.parts;

public class Cylinders {
    Engine engine;
    Wheels wheels;

    Cylinders(Engine engine, Wheels wheels){
        this.engine = engine;
                this.wheels=wheels;
    }

    void drive(){

    }
}
