package com.example.api.firstkotlinapi.DTO

data class AddPersonRequest(
    val id: Long,
    val name: String,
    val lastName: String?
)
