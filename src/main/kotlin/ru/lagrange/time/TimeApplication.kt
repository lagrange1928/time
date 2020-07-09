package ru.lagrange.time

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class TimeApplication {
}

fun main(args: Array<String>) {
    SpringApplication.run(TimeApplication::class.java, *args)
}