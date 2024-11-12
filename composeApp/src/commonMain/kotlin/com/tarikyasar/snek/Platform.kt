package com.tarikyasar.snek

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform