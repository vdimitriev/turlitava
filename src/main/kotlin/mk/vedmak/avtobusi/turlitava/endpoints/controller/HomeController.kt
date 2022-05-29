package mk.vedmak.avtobusi.turlitava.endpoints.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @RequestMapping("/")
    fun index(): String {
        return "index"
    }
}