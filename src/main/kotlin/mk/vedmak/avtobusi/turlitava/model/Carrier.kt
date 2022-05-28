package mk.vedmak.avtobusi.turlitava.model

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship
import org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING

@Node
data class Carrier(

    @Id
    val name: String,

    @Relationship(type="LOCATED", direction = OUTGOING)
    val location: Location? = null,

    val latinName: String? = null,

    val cyrillicName: String? = null,

    val descriptionLatin: String? = null,

    val descriptionCyrillic: String? = null,

    ) {

    override fun equals(other: Any?): Boolean = other is Carrier && other.name == name

    override fun hashCode(): Int = name.hashCode()

    override fun toString(): String {
        return "$name"
    }
}