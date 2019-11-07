package com.hellspear.dagger2practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hellspear.dagger2practice.components.DaggerActivityComponent
import com.hellspear.dagger2practice.modules.DieselEngineModule
import com.hellspear.dagger2practice.parts.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject //Dagger does not support injection into private fields->cannot make "PRIVATE" of "FINAL"
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component =
//            DaggerActivityComponent
//                .builder()
//                //.dieselEngineModule(DieselEngineModule(hp = 100))
//                .horsePower(150)
//                .engineCapacity(1400)
//                .build()

        val component = DaggerActivityComponent.builder()
            .horsePower(120)
            .engineCapacity(1400)
            .appComponent((application as ExampleApp).appComponent)
            .build()

        component.inject(this)
        car1.drive()
        car2.drive()

    }
}
