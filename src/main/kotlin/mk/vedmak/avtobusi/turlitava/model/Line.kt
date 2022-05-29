package mk.vedmak.avtobusi.turlitava.model

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship
import org.springframework.data.neo4j.core.schema.Relationship.Direction.INCOMING

@Node
data class Line(

    @Id
    val name: String?,

    val fullNameLatin: String?,

    val fullNameCyrillic: String?,

    val lineNumber: Int,

    @Relationship("OPERATES", direction = INCOMING)
    var carrier: Carrier? = null,

    val description: String? = null,

    val descriptionLatin: String? = null,

    val descriptionCyrillic: String? = null,

    ) {

    override fun toString(): String {
        return "$name + carrier: $carrier"
    }
}