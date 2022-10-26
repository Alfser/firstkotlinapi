package com.example.api.firstkotlinapi.service

import com.example.api.firstkotlinapi.DTO.AddPersonRequest
import com.example.api.firstkotlinapi.DTO.PersonResponse
import com.example.api.firstkotlinapi.DTO.UpdatePersonRequest

interface PersonManagementService {

    fun findById(id: Long): PersonResponse?
    fun findAll():List<PersonResponse>
    fun save(addPersonRequest: AddPersonRequest): PersonResponse
    fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse
    fun deleteById(id: Long)
}