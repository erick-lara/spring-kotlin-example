package com.erick.lara.springkotlinexample.adapter.database.entities

import javax.persistence.*

@Entity
@Table(name = "tb_nugget")
data class NuggetEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idNugget: Int,
    val flavor: String,
    val calories: Double
)
