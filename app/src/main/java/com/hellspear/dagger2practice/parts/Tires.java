package com.hellspear.dagger2practice.parts;

public class Tires {
    Engine engine;
    Wheels wheels;

    Tires(Engine engine, Wheels wheels){
        this.engine = engine;
                this.wheels=wheels;
    }

    void drive(){

    }
}
