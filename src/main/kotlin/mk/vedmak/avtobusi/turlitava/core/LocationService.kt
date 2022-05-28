package mk.vedmak.avtobusi.turlitava.core

import mk.vedmak.avtobusi.turlitava.endpoints.model.LocationDto
import mk.vedmak.avtobusi.turlitava.repository.LocationRepository
import mk.vedmak.avtobusi.turlitava.repository.StationRepository
import mk.vedmak.avtobusi.turlitava.repository.StopRepository
import mu.KotlinLogging
import org.springframework.stereotype.Component

@Component
class LocationService(

    val locationRepository: LocationRepository,
    val stationRepository: StationRepository,
    val stopRepository: StopRepository

    ) {

    private val logger = KotlinLogging.logger{}

    fun searchByTerm(searchTerm: String):List<LocationDto> {
        logger.info("search location by term $searchTerm")
        return listOf()
    }

    fun searchByTermAndLocale(searchTerm: String, locale: String):List<LocationDto> {
        logger.info("search location by term $searchTerm and locale $locale")
        return listOf()
    }
}