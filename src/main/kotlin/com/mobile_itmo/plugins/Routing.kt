package com.mobile_itmo.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("This is a api for our lab: itmo-mobile")
        }
    }
}
