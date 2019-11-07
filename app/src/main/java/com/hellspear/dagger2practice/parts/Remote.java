package com.hellspear.dagger2practice.parts;

import android.util.Log;

import com.hellspear.dagger2practice.Car;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";
    
    @Inject
    public Remote(){
        
    }
    
    public void setListener(Car car){
        Log.d(TAG, "setListener: Remote connected");
    }
}
