package com.hellspear.dagger2practice;

import android.app.Application;

import com.hellspear.dagger2practice.components.ActivityComponent;
import com.hellspear.dagger2practice.components.AppComponent;
import com.hellspear.dagger2practice.components.DaggerAppComponent;
import com.hellspear.dagger2practice.modules.DriverModule;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.factory().create(new DriverModule("haha"));
        //component
    }

    public AppComponent getAppComponent(){
        return component;
    }
}
