package com.hellspear.dagger2practice.parts;

import javax.inject.Inject;

public class Wheels {
    //if we don't own this class so we can't annotate it with @inject

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires){
        this.rims=rims;
        this.tires=tires;
    }
}
