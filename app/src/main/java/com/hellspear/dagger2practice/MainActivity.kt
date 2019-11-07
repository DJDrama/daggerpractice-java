package com.hellspear.dagger2practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hellspear.dagger2practice.parts.*

class MainActivity : AppCompatActivity() {

    private lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.create() //compile time dagger created dagger+carcomponent

        car = component.car
        car.drive()

    }
}
