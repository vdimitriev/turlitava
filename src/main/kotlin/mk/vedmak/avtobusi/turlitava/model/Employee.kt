package mk.vedmak.avtobusi.turlitava.model

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node

@Node
data class Employee(

    @Id
    val id: Long,

    val firstName: String,

    val lastName: String,

    val description: String,
) {
    override fun toString(): String {
        return "$firstName $lastName"
    }
}