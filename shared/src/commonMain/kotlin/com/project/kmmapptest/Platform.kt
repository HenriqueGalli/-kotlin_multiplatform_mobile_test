package com.project.kmmapptest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform