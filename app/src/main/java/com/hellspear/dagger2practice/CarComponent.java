package com.hellspear.dagger2practice;

import com.hellspear.dagger2practice.modules.DieselEngineModule;
import com.hellspear.dagger2practice.modules.PetrolEngineModule;
import com.hellspear.dagger2practice.modules.WheelsModule;
import com.hellspear.dagger2practice.parts.Wheels;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class}) //puts this module into this component
public interface CarComponent {  //<- Injector

    Car getCar();

    void inject(MainActivity mainActivity); //Should declare directly. shouldn't be Activity mainActivity

}
