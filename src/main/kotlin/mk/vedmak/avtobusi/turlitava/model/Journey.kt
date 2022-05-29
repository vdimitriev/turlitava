package mk.vedmak.avtobusi.turlitava.model

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship
import org.springframework.data.neo4j.core.schema.Relationship.Direction.INCOMING
import org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING

@Node
data class Journey(

    @Id
    val name: String,

    val carrierName: String,

    val lineNumber: Int,

    var journeyNumber: Int?,

    @Relationship("DEPARTS", direction = OUTGOING)
    val departure: Location? = null,

    @Relationship("ARRIVES", direction = OUTGOING)
    val arrival: Location? = null,

    @Relationship("PERFORMS", direction = INCOMING)
    var line: Line? = null,

    @Relationship("CONTAINS", direction = OUTGOING)
    var trips: List<Trip>? = null,

    val description: String? = null,

    @Relationship("MAINTAINS", direction = OUTGOING)
    var schedules: List<Schedule>? = null,

    var distance: Int = 0,

    var fullNameLatin:String = "",

    var fullNameCyrillic:String = "",

    ) {

    override fun equals(other: Any?): Boolean = other is Journey && other.carrierName == carrierName && other.lineNumber == lineNumber && other.departure == departure && other.arrival == arrival

    override fun hashCode(): Int = carrierName.hashCode() + lineNumber.hashCode() + departure.hashCode() + arrival.hashCode()

    override fun toString(): String {
        return "$name"
    }
}