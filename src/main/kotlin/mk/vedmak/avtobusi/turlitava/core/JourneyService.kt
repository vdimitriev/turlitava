package mk.vedmak.avtobusi.turlitava.core

import mk.vedmak.avtobusi.turlitava.endpoints.model.JourneyDto
import mk.vedmak.avtobusi.turlitava.model.Journey
import mk.vedmak.avtobusi.turlitava.repository.JourneyRepository
import mu.KotlinLogging
import org.springframework.stereotype.Component

@Component
class JourneyService(

    val journeyRepository: JourneyRepository

    ) {

    private val logger = KotlinLogging.logger{}

    fun searchJourneysByDepartureAndArrivalSimple(departure: String, arrival: String): List<Journey> {
        logger.info("search for journeys by departure $departure and arrival $arrival")
        return journeyRepository.findByDepartureAndArrival(departure, arrival)
    }

    fun searchJourneysByDepartureAndArrival(departure: String, arrival: String): List<Journey> {
        logger.info("search for journeys by departure $departure and arrival $arrival")
        return journeyRepository.findByDepartureAndArrival(departure, arrival)
    }

    fun searchJourneysByDepartureArrivalAndDate(departure: String, arrival: String, date: String): List<Journey> {
        logger.info("search for journeys by departure place $departure, arrival place $arrival and date $date")
        return journeyRepository.findByDepartureAndArrival(departure, arrival)
    }

    fun searchJourneysByDepartureArrivalDateAndLocale(departure: String, arrival: String, date: String, locale: String): List<Journey> {
        logger.info("search for journeys by departure place $departure, arrival place $arrival, date $date and locale $locale")
        return journeyRepository.findByDepartureAndArrival(departure, arrival)
    }
}