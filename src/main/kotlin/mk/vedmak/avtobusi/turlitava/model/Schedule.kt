package mk.vedmak.avtobusi.turlitava.model

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship

@Node
data class Schedule(

    @Id
    var name: String = "",

    var workDays: List<Int> = ArrayList(),

    @Relationship("VALID", direction = Relationship.Direction.OUTGOING)
    var workPeriods: List<Period>? = null,

    var workMonths: List<Int> = ArrayList(),

    var holidays: Boolean = true,

    var description: String = "",

    var descriptionLatin: String = "",

    var descriptionCyrillic: String = "",

    var tripNumbers: String = "",

) {
    override fun toString(): String {
        return "$name"
    }
}