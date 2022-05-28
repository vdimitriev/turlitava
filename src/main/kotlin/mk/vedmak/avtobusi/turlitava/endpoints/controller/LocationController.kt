package mk.vedmak.avtobusi.turlitava.endpoints.controller

import mk.vedmak.avtobusi.turlitava.core.LocationService
import mk.vedmak.avtobusi.turlitava.endpoints.model.LocationDto
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/locations")
class LocationController(

    val locationService: LocationService

    ) {

    private val logger = KotlinLogging.logger{}

    @GetMapping(value = ["/search"], produces = ["application/json"])
    fun getBySearchTerm(@RequestParam("term") searchTerm: String): List<LocationDto> {
        logger.info("get by search term $searchTerm")
        return locationService.searchByTerm(searchTerm)
    }

    @GetMapping(value = ["/find"], produces = ["application/json"])
    fun getBySearchTermAndLocale(
        @RequestParam("term") searchTerm: String,
        @RequestParam("locale") locale: String,
        ): List<LocationDto> {
        logger.info("get by search term $searchTerm and locale $locale")
        return locationService.searchByTermAndLocale(searchTerm, locale)
    }
}