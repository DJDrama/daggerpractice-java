package com.hellspear.dagger2practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hellspear.dagger2practice.parts.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val block = Block()
        val cylinders = Cylinders()
        val sparkPlugs = SparkPlugs()
        val tires = Tires()
        val rims = Rims()

        val engine = Engine(block, cylinders, sparkPlugs)
        val wheels = Wheels(tires, rims
        )
        val car = Car(engine, wheels)

        //val component = DaggerCarComponent.create()
        //val car = component.getCar()

        car.drive()

    }
}
