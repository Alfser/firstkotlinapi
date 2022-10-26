package com.example.api.firstkotlinapi.transformer

interface Transformer <A, B> {
    fun transformer(source: A): B
}