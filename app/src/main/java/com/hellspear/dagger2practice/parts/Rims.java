package com.hellspear.dagger2practice.parts;

public class Rims {
    Engine engine;
    Wheels wheels;

    Rims(Engine engine, Wheels wheels){
        this.engine = engine;
                this.wheels=wheels;
    }

    void drive(){

    }
}
