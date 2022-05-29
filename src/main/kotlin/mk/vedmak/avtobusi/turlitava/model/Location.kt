package mk.vedmak.avtobusi.turlitava.model

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship
import org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING

@Node
data class Location(

    @Id
    val name: String?,

    val latinName: String?,

    val cyrillicName: String?,

    @Relationship(type = "LAYS", direction = OUTGOING)
    val country: Country? = null,

    val category: Int? = 0,

    val description: String? = null,

    ) {

    override fun toString(): String {
        return "$name - $latinName - $cyrillicName - $description"
    }
}