package mk.vedmak.avtobusi.turlitava.model

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship
import org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING

@Node
data class Station(

    @Id
    val name: String,

    @Relationship(type="SITUATED", direction = OUTGOING)
    val location: Location? = null,

    val address: String? = null,

    val telephoneNumber: String? = null,

    val website: String? = null,

    val email: String? = null

) {

    override fun toString(): String {
        return "$name - station location $location"
    }
}