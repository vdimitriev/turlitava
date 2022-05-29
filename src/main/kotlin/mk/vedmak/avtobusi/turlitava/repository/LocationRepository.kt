package mk.vedmak.avtobusi.turlitava.repository

import mk.vedmak.avtobusi.turlitava.model.Location
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.data.neo4j.repository.query.Query
import org.springframework.stereotype.Repository

@Repository
interface LocationRepository: Neo4jRepository<Location, String> {

    @Query("match (l:Location) where (l.latinName contains \$term or l.cyrillicName contains \$term) return l order by l.category asc, l.name desc limit 10")
    fun findBySearchTerm(term: String): List<Location>
}