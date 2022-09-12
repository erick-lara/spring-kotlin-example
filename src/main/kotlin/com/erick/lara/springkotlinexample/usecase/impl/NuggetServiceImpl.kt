package com.erick.lara.springkotlinexample.usecase.impl

import com.erick.lara.springkotlinexample.adapter.database.entities.NuggetEntity
import com.erick.lara.springkotlinexample.adapter.gateway.db.DbGateway
import com.erick.lara.springkotlinexample.domain.Nugget
import com.erick.lara.springkotlinexample.usecase.NuggetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NuggetServiceImpl(@Autowired private val gateway: DbGateway): NuggetService {

    override fun createNugget(nugget: NuggetEntity): Nugget {
        return gateway.createNugget(nugget)
    }

}