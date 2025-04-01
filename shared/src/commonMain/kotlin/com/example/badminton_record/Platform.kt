package com.example.badminton_record

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform