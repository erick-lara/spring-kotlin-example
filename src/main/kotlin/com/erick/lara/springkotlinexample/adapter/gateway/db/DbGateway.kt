package com.erick.lara.springkotlinexample.adapter.gateway.db

import com.erick.lara.springkotlinexample.adapter.database.entities.NuggetEntity
import com.erick.lara.springkotlinexample.domain.Nugget

interface DbGateway {
    fun createNugget(nugget: NuggetEntity): Nugget
}