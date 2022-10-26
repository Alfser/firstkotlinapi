package com.example.api.firstkotlinapi.resources

import com.example.api.firstkotlinapi.DTO.AddPersonRequest
import com.example.api.firstkotlinapi.DTO.PersonResponse
import com.example.api.firstkotlinapi.DTO.UpdatePersonRequest
import org.springframework.http.ResponseEntity

interface PersonResource {
    fun findById(id: Long): ResponseEntity<PersonResponse?>
    fun findAll():ResponseEntity<List<PersonResponse>>
    fun save(addPersonRequest: AddPersonRequest): ResponseEntity<PersonResponse>
    fun update(updatePersonRequest: UpdatePersonRequest): ResponseEntity<PersonResponse>
    fun deleteById(id: Long): ResponseEntity<Unit>
}