package com.hellspear.dagger2practice;

import dagger.Component;

@Component
public interface CarComponent {  //<- Injector

    Car getCar();

}
