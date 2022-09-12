package com.erick.lara.springkotlinexample.adapter.controllers

import com.erick.lara.springkotlinexample.adapter.database.entities.NuggetEntity
import com.erick.lara.springkotlinexample.domain.Nugget
import com.erick.lara.springkotlinexample.usecase.NuggetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/nuggets")
class NuggetController(@Autowired private val nuggetService: NuggetService) {

    @PostMapping
    fun createNugget(@RequestBody nugget: NuggetEntity): ResponseEntity<Nugget> {
        return ResponseEntity.ok(nuggetService.createNugget(nugget))
    }
}