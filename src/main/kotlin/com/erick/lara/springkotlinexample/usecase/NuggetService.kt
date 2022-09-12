package com.erick.lara.springkotlinexample.usecase

import com.erick.lara.springkotlinexample.adapter.database.entities.NuggetEntity
import com.erick.lara.springkotlinexample.domain.Nugget

interface NuggetService {
    fun createNugget(nugget: NuggetEntity): Nugget
}