package com.hellspear.dagger2practice.modules

import com.hellspear.dagger2practice.parts.DieselEngine
import com.hellspear.dagger2practice.parts.Engine
import com.hellspear.dagger2practice.parts.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule(hp: Int) {
    private var horsePower: Int = hp

    @Provides
    fun provideEngine(): Engine{
        return DieselEngine(horsePower)
    }
}