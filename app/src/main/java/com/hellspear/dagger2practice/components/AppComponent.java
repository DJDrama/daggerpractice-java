package com.hellspear.dagger2practice.components;

import com.hellspear.dagger2practice.Driver;
import com.hellspear.dagger2practice.modules.DieselEngineModule;
import com.hellspear.dagger2practice.modules.DriverModule;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

   // Driver getDriver();

    //Factory method
   // ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
    ActivityComponent.Builder getActivityComponentBuilder();

}
