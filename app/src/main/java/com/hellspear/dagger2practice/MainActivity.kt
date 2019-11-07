package com.hellspear.dagger2practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hellspear.dagger2practice.parts.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject //Dagger does not support injection into private fields->cannot make "PRIVATE" of "FINAL"
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.create() //compile time dagger created dagger+carcomponent
        component.inject(this) //<-- Field Injection. take our activity and check fields
        //car = component.car
        car.drive()

    }
}
