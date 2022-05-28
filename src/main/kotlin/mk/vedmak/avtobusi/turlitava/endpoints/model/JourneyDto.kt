package mk.vedmak.avtobusi.turlitava.endpoints.model

data class JourneyDto(
    val name: String? = null,
    val carrierName: String? = null,
    val lineNumber: Int? = null,
    var journeyNumber: Int? = null,
    val departure: String? = null,
    val arrival: String? = null,
)