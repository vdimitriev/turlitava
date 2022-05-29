package mk.vedmak.avtobusi.turlitava.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class JourneyServiceIT() {

    @Autowired
    private lateinit var journeyService: JourneyService

    @Test
    fun findJourneysByDepartureAndArrivalSimple() {
        val departure = "BIT"
        val arrival = "OHR"
        val journeys = journeyService.searchJourneysByDepartureAndArrivalSimple(departure, arrival)
        journeys.forEach {
            println(it)
        }
        Assertions.assertTrue(journeys.isNotEmpty())
    }
}