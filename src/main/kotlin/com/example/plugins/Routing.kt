package com.example.plugins

import com.example.jsonresponse.data
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    
    routing {
        post("api/dashboard/dynamic/v2/menu"){
            call.respond(data)
        }
    }
}
