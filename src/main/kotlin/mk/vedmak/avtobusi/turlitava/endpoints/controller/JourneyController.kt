package mk.vedmak.avtobusi.turlitava.endpoints.controller

import mk.vedmak.avtobusi.turlitava.core.JourneyService
import mk.vedmak.avtobusi.turlitava.endpoints.model.JourneyDto
import mk.vedmak.avtobusi.turlitava.model.Journey
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/journeys")
class JourneyController(

    val journeyService: JourneyService

    ) {

    private val logger = KotlinLogging.logger{}

    @GetMapping(value = ["/search/{departure}/{arrival}"], produces = ["application/json"])
    fun getByDepartureAndArrival(
        @PathVariable("departure") departure: String,
        @PathVariable("arrival") arrival: String,
        ):List<Journey> {

        logger.info("get by departure $departure and arrival $arrival")
        return journeyService.searchJourneysByDepartureAndArrival(departure, arrival)
    }

    @GetMapping(value = ["/search/{departure}/{arrival}/{date}"], produces = ["application/json"])
    fun getByDepartureArrivalAndDate(
        @PathVariable("departure") departure: String,
        @PathVariable("arrival") arrival: String,
        @PathVariable("date") date: String
        ):List<Journey> {

        logger.info("get by departure $departure, arrival $arrival and date $date")
        return journeyService.searchJourneysByDepartureArrivalAndDate(departure, arrival, date)
    }

    @GetMapping(value = ["/search/{departure}/{arrival}/{date}/{locale}"], produces = ["application/json"])
    fun getByDepartureArrivalDateAndLocale(
        @PathVariable("departure") departure: String,
        @PathVariable("arrival") arrival: String,
        @PathVariable("date") date: String,
        @PathVariable("locale") locale: String
        ):List<Journey> {

        logger.info("get by departure $departure, arrival $arrival, date $date and locale $locale")
        return journeyService.searchJourneysByDepartureArrivalDateAndLocale(departure, arrival, date, locale)
    }
}