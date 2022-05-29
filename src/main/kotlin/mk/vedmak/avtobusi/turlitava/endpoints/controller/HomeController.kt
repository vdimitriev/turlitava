package mk.vedmak.avtobusi.turlitava.endpoints.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class HomeController {

    @RequestMapping("/")
    fun index(): String {
        return "index"
    }
}