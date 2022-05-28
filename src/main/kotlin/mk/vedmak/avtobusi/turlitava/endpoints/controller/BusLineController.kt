package mk.vedmak.avtobusi.turlitava.endpoints.controller

import mk.vedmak.avtobusi.turlitava.endpoints.model.BusLineDto
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/buslines")
class BusLineController {

    private val logger = KotlinLogging.logger{}

    @GetMapping(value = ["/search/{departure}/{arrival}"])
    fun getByDepartureAndArrival(
        @PathVariable("departure") departure: String,
        @PathVariable("arrival") arrival: String,
    ):List<BusLineDto> {
        logger.info("get by departure $departure and arrival $arrival")
        return listOf()
    }

    @GetMapping(value = ["/search/{departure}/{arrival}/{date}"])
    fun getByDepartureArrivalAndDate(
        @PathVariable("departure") departure: String,
        @PathVariable("arrival") arrival: String,
        @PathVariable("date") date: String
    ):List<BusLineDto> {

        logger.info("get by departure $departure, arrival $arrival and date $date")
        return listOf()
    }

    @GetMapping(value = ["/search/{departure}/{arrival}/{date}/{locale}"])
    fun getByDepartureArrivalDateAndLocale(
        @PathVariable("departure") departure: String,
        @PathVariable("arrival") arrival: String,
        @PathVariable("date") date: String,
        @PathVariable("locale") locale: String
    ):List<BusLineDto> {

        logger.info("get by departure $departure, arrival $arrival, date $date and locale $locale")
        return listOf()
    }
}