package com.hellspear.dagger2practice;

import com.hellspear.dagger2practice.modules.PetrolEngineModule;
import com.hellspear.dagger2practice.modules.WheelsModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton //singleton only works for each component.
@Component (modules = {WheelsModule.class, PetrolEngineModule.class}) //puts this module into this component
public interface CarComponent {  //<- Injector

    Car getCar();

    void inject(MainActivity mainActivity); //Should declare directly. shouldn't be Activity mainActivity

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();

    }
}
