package com.example.api.firstkotlinapi

import com.example.api.firstkotlinapi.domain.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class FirstkotlinapiApplication{

	@GetMapping
	fun helloWorld(): String{
		return "Hello Guy! This is my firs API in Springboot"
	}
}

fun main(args: Array<String>) {
	runApplication<FirstkotlinapiApplication>(*args)
}
