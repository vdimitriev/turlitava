package mk.vedmak.avtobusi.turlitava.repository

import mk.vedmak.avtobusi.turlitava.model.Journey
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.data.neo4j.repository.query.Query
import org.springframework.stereotype.Repository

@Repository
interface JourneyRepository: Neo4jRepository<Journey, String> {

//    //@Query("MATCH (a:Location)<-[ja:ARRIVES_AT]-(j:Journey)-[jd:DEPARTS_AT]->(d:Location) MATCH (j)-[jt:CONTAINS]->(t:Trip)->[ts:STOPS_AT]->(s:Stop) where d.name = 'BT' and a.name = 'OH' RETURN j,jd,d,ja,a,jt,t,ts,s")
//    @Query("MATCH (j:Journey)-[c:CONTAINS]->(t:Trip)-[sa:STOPS_AT]->(s:Stop) MATCH (j:Journey)-[p:PART_OF]->(l:Line)-[o:PERFORMED_BY]->(car:Carrier) where j.departure = 'BT' and j.arrival = 'OH' RETURN j,collect(c),collect(t),collect(sa),collect(s),collect(p),collect(l),collect(o),collect(car)")
//    //@Query("MATCH (j:Journey)-[c:CONTAINS]->(t:Trip)-[sa:STOPS_AT]->(s:Stop) MATCH (j:Journey)<-[p:PERFORMS]-(l:Line)<-[o:OPERATES]-(car:Carrier) where j.departure = 'BT' and j.arrival = 'OH' RETURN j,collect(c),collect(t),collect(sa),collect(s),collect(p),collect(l),collect(o),collect(car)")
//    fun findJourneys(): Collection<Journey>
//
//    fun findByDeparture(departure: String): Collection<Journey>
//
//    fun findByDepartureAndArrival(departure: String, arrival: String): Collection<Journey>

    @Query( "MATCH (car:Carrier)-[o:OPERATES]->(l:Line)-[p:PERFORMS]->(j:Journey)-[c:CONTAINS]->(t:Trip)-[sa:STOPS]->(s:Stop) " +
            "WHERE j.departure.cyrillicName = :departure AND j.arrival.cyrillicName = :arrival " +
            "RETURN j,collect(c),collect(t),collect(sa),collect(s),collect(p),collect(l),collect(o),collect(car)")
    fun findByDepartureAndArrival(departure: String, arrival: String): List<Journey>
}