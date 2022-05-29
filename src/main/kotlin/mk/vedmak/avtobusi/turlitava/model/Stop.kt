package mk.vedmak.avtobusi.turlitava.model

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship
import org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING
import java.time.LocalTime

@Node
data class Stop(

    @Id
    val name: String,

    val time: LocalTime?,

    @Relationship(type="AT", direction = OUTGOING)
    val station: Station? = null,

    val stopNumber: Int? = 0,

    val description: String? = null,

    ) {

    override fun toString(): String {
        return "$name - station: $station"
    }
}