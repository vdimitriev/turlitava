package mk.vedmak.avtobusi.turlitava.repository

import mk.vedmak.avtobusi.turlitava.model.Stop
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface StopRepository: Neo4jRepository<Stop, String> {
//    @Query("MATCH (trp:Trip {name: 'TRA0101'}) -[*]-> (stp:Stop) RETURN stp")
//    fun findByDepartureAndArrival(): List<Stop>

}