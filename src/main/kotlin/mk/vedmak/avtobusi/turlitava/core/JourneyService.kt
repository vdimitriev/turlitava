package mk.vedmak.avtobusi.turlitava.core

import mk.vedmak.avtobusi.turlitava.endpoints.model.JourneyDto
import mk.vedmak.avtobusi.turlitava.repository.JourneyRepository
import mu.KotlinLogging
import org.springframework.stereotype.Component

@Component
class JourneyService(

    val journeyRepository: JourneyRepository

    ) {

    private val logger = KotlinLogging.logger{}

    fun searchJourneysByDepartureAndArrival(departure: String, arrival: String): List<JourneyDto> {
        logger.info("search for journeys by departure $departure and arrival $arrival")
        return listOf()
    }

    fun searchJourneysByDepartureArrivalAndDate(departure: String, arrival: String, date: String): List<JourneyDto> {
        logger.info("search for journeys by departure place $departure, arrival place $arrival and date $date")
        return listOf()
    }

    fun searchJourneysByDepartureArrivalDateAndLocale(departure: String, arrival: String, date: String, locale: String): List<JourneyDto> {
        logger.info("search for journeys by departure place $departure, arrival place $arrival, date $date and locale $locale")
        return listOf()
    }
}