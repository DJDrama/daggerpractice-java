package com.hellspear.dagger2practice;

import android.app.Application;

import com.hellspear.dagger2practice.components.ActivityComponent;
import com.hellspear.dagger2practice.components.AppComponent;
import com.hellspear.dagger2practice.components.DaggerAppComponent;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
        //component
    }

    public AppComponent getAppComponent(){
        return component;
    }
}
