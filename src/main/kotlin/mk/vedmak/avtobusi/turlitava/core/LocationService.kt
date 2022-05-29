package mk.vedmak.avtobusi.turlitava.core

import mk.vedmak.avtobusi.turlitava.endpoints.model.LocationDto
import mk.vedmak.avtobusi.turlitava.model.Location
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

    fun searchByTerm(searchTerm: String):List<Location> {
        logger.info("search location by term $searchTerm")
        return locationRepository.findBySearchTerm(searchTerm.replaceFirstChar { it.uppercase() })
    }

    fun searchByTermAndLocale(searchTerm: String, locale: String):List<Location> {
        logger.info("search location by term $searchTerm and locale $locale")
        return locationRepository.findBySearchTerm(searchTerm)
    }
}