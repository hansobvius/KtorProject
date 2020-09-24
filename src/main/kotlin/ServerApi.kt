import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.netty.handler.codec.http.HttpHeaderDateFormat.get

object ServerApi {

    val server = embeddedServer(Netty, port = 8080){
        routing{
            get("/"){
                call.respondText("Hello World", ContentType.Text.Plain)
            }
            get("/demo"){
                call.respondText("HELLO WORLD")
            }
        }
    }
}