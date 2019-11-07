package com.hellspear.dagger2practice.modules;

import com.hellspear.dagger2practice.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static Driver getDriver(){
        return new Driver();
    }

}
