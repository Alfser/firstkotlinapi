package com.example.api.firstkotlinapi.DAO

import com.example.api.firstkotlinapi.domain.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonDAO : JpaRepository<Person, Long>