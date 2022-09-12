package com.erick.lara.springkotlinexample.adapter.gateway.db.impl

import com.erick.lara.springkotlinexample.adapter.database.entities.NuggetEntity
import com.erick.lara.springkotlinexample.adapter.database.repositories.NuggetRepository
import com.erick.lara.springkotlinexample.adapter.gateway.db.DbGateway
import com.erick.lara.springkotlinexample.adapter.gateway.mapper.NuggetMapper
import com.erick.lara.springkotlinexample.domain.Nugget
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DbGatewayImpl(@Autowired private val nuggetRepository: NuggetRepository): DbGateway {
    override fun createNugget(nugget: NuggetEntity): Nugget {
        return NuggetMapper
            .convertEntityToDomain(nuggetRepository.save(nugget))
    }
}