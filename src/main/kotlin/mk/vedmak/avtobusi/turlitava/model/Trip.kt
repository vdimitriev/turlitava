package mk.vedmak.avtobusi.turlitava.model

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship
import org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING
import java.time.LocalTime

@Node
data class Trip(

    @Id
    val name: String,

    val lineNumber: Int = 0,

    val journeyNumber: Int = 0,

    val tripNumber: Int = 0,

    @Relationship("STOPS", direction = OUTGOING)
    var stops: List<Stop>? = null,

    @Relationship("MAINTAINS", direction = OUTGOING)
    val schedules: List<Schedule>? = null,

    val description: String? = null,

    var travelTime: String? = null,

    var scheduledDepartureTime: LocalTime? = null,

    var scheduledArrivalTime: LocalTime? = null,

    ) {

    override fun toString(): String {
        return "$name - stops: $stops"
    }

}