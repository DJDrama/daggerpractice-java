package com.hellspear.dagger2practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hellspear.dagger2practice.parts.Engine
import com.hellspear.dagger2practice.parts.Wheels

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val engine = Engine()
        val wheels = Wheels()
        val car = Car(engine, wheels)
        car.drive()

    }
}
