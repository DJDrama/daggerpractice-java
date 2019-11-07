package com.hellspear.dagger2practice.modules;

import com.hellspear.dagger2practice.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    private String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Provides
    @Singleton
    Driver getDriver(){
        return new Driver(this.driverName);
    }

}
