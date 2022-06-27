package mk.vedmak.avtobusi.turlitava.endpoints.controller

import mk.vedmak.avtobusi.turlitava.core.JourneyService
import mk.vedmak.avtobusi.turlitava.endpoints.mapper.Mapper
import mk.vedmak.avtobusi.turlitava.endpoints.model.JourneyDto
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/journeys")
class JourneyController(

    val journeyService: JourneyService,
    val mapper: Mapper

    ) {

    private val logger = KotlinLogging.logger{}

    @GetMapping(value = ["/search/{departure}/{arrival}"], produces = ["application/json"])
    fun getByDepartureAndArrival(
        @PathVariable("departure") departure: String,
        @PathVariable("arrival") arrival: String,
    ): List<JourneyDto> {

        logger.info("get by departure $departure and arrival $arrival")
        val journeys = journeyService.searchJourneysByDepartureAndArrival(departure, arrival)
        return journeys.map { mapper.toJourneyDto(it) }
    }

    @GetMapping(value = ["/search/{departure}/{arrival}/{date}"], produces = ["application/json"])
    fun getByDepartureArrivalAndDate(
        @PathVariable("departure") departure: String,
        @PathVariable("arrival") arrival: String,
        @PathVariable("date") date: String
        ):List<JourneyDto> {

        logger.info("get by departure $departure, arrival $arrival and date $date")
        val journeys = journeyService.searchJourneysByDepartureArrivalAndDate(departure, arrival, date)
        return journeys.map { mapper.toJourneyDto(it) }

    }

    @GetMapping(value = ["/search/{departure}/{arrival}/{date}/{locale}"], produces = ["application/json"])
    fun getByDepartureArrivalDateAndLocale(
        @PathVariable("departure") departure: String,
        @PathVariable("arrival") arrival: String,
        @PathVariable("date") date: String,
        @PathVariable("locale") locale: String
        ):List<JourneyDto> {

        logger.info("get by departure $departure, arrival $arrival, date $date and locale $locale")
        val journeys = journeyService.searchJourneysByDepartureArrivalDateAndLocale(departure, arrival, date, locale)
        return journeys.map { mapper.toJourneyDto(it) }
    }
}