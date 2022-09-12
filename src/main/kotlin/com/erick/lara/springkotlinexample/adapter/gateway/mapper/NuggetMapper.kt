package com.erick.lara.springkotlinexample.adapter.gateway.mapper

import com.erick.lara.springkotlinexample.adapter.database.entities.NuggetEntity
import com.erick.lara.springkotlinexample.domain.Nugget

class NuggetMapper {
    companion object{
        fun convertEntityToDomain(nugget: NuggetEntity) =
            Nugget(
                idNugget = nugget.idNugget,
                flavor = nugget.flavor,
                calories = nugget.calories
            )
    }
}