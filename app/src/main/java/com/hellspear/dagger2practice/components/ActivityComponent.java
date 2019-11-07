package com.hellspear.dagger2practice.components;

import com.hellspear.dagger2practice.Car;
import com.hellspear.dagger2practice.MainActivity;
import com.hellspear.dagger2practice.PerActivity;
import com.hellspear.dagger2practice.modules.DieselEngineModule;
import com.hellspear.dagger2practice.modules.PetrolEngineModule;
import com.hellspear.dagger2practice.modules.WheelsModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

//@Singleton //singleton only works for each component. so we need singleton in whole application
@PerActivity
//@Component (dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class}) //puts this module into this component
@Subcomponent(modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {  //<- Injector

    Car getCar();

    void inject(MainActivity mainActivity); //Should declare directly. shouldn't be Activity mainActivity

//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        Builder horsePower(@Named("horse power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
//
//        Builder appComponent(AppComponent component);
//
//        ActivityComponent build();
//
//    }
}
