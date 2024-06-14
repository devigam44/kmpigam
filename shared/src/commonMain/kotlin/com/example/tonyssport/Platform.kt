package com.example.tonyssport

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform