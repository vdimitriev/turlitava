package mk.vedmak.avtobusi.turlitava.endpoints.mapper

import mk.vedmak.avtobusi.turlitava.endpoints.model.JourneyDto
import mk.vedmak.avtobusi.turlitava.endpoints.model.LocationDto
import mk.vedmak.avtobusi.turlitava.model.Journey
import mk.vedmak.avtobusi.turlitava.model.Location
import org.springframework.stereotype.Component

@Component
class Mapper {

    fun toJourneyDto(journey: Journey): JourneyDto =
        JourneyDto(
            name = journey.name,
            carrierName = journey.carrierName,
            lineNumber = journey.lineNumber,
            journeyNumber = journey.journeyNumber,
            departure = journey.departure?.name,
            arrival = journey.arrival?.name
        )

    fun toLocationDto(location: Location):LocationDto =
        LocationDto(
            name = location.name,
            latinName = location.latinName,
            cyrillicName = location.cyrillicName
        )
}