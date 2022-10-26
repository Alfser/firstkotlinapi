package com.example.api.firstkotlinapi.transformer

import com.example.api.firstkotlinapi.DTO.AddPersonRequest
import com.example.api.firstkotlinapi.domain.Person
import org.springframework.stereotype.Component

@Component
class AddPersonRequestTransformer: Transformer<AddPersonRequest, Person> {
    override fun transformer(source: AddPersonRequest): Person {
        return Person(
            name = source.name,
            lastName = source.lastName
        )
    }
}