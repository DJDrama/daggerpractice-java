package com.hellspear.dagger2practice.modules;

import com.hellspear.dagger2practice.parts.Rims;
import com.hellspear.dagger2practice.parts.Tires;
import com.hellspear.dagger2practice.parts.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides //most common annotation.
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate(); //before returning can do configuration
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }

}
