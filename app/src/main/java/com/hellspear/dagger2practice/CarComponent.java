package com.hellspear.dagger2practice;

import dagger.Component;

@Component
public interface CarComponent {  //<- Injector

    Car getCar();

    void inject(MainActivity mainActivity); //Should declare directly. shouldn't be Activity mainActivity

}
