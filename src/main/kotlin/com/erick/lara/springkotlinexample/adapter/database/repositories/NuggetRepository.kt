package com.erick.lara.springkotlinexample.adapter.database.repositories

import com.erick.lara.springkotlinexample.adapter.database.entities.NuggetEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NuggetRepository: JpaRepository<NuggetEntity, Int> {
}