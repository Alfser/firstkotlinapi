package com.example.api.firstkotlinapi.DTO

data class UpdatePersonRequest(
    val id: Long,
    val name: String,
    val lastName: String
)
