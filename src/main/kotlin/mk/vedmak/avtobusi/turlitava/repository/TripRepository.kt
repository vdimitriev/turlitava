package mk.vedmak.avtobusi.turlitava.repository

import mk.vedmak.avtobusi.turlitava.model.Trip
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface TripRepository: Neo4jRepository<Trip, String> {
//
//    @Query("MATCH (trp:Trip)-[tl*]->(loc:Location) RETURN distinct trp")
//    fun findByDepartureAndArrival(): List<Trip>
//
//    @Query("MATCH (trp:Trip {name: 'TRA0101'}) -[*]-> (stp:Stop) RETURN trp")
//    fun findByDepartureAndArrival(): List<Trip>
}