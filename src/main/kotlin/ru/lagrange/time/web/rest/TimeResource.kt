package ru.lagrange.time.web.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime
import java.time.ZoneId

@RestController
class TimeResource {

    @GetMapping("time")
    fun getTime(): String {
        val time: OffsetDateTime? = OffsetDateTime.now(ZoneId.of("UTC"))
        return time.toString()
    }
}