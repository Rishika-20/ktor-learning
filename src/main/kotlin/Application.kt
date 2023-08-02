import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    embeddedServer(Netty, port = 8081) {

        //module()
        routing {
            get("/greet") {
                call.respondText("Hello, Welcome to Ktor Tutorials!!")
            }
        }
    }.start(wait = true)
    }

//}

//fun Application.module(){
//    routing {
//        get("/greet") {
//            call.respondText("Hello, Welcome to Ktor Tutorials!!")
//        }
//    }
//}