package com.example.api.firstkotlinapi.transformer

import com.example.api.firstkotlinapi.DTO.PersonResponse
import com.example.api.firstkotlinapi.domain.Person


fun Person?.toPersonResponse(): PersonResponse{
    return PersonResponse(
        id = this?.id ?: 1L,
        fullName = "${this?.lastName}, ${this?.name}"
    )
}