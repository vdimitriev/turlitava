package mk.vedmak.avtobusi.turlitava.repository

import mk.vedmak.avtobusi.turlitava.model.Journey
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.data.neo4j.repository.query.Query
import org.springframework.stereotype.Repository

@Repository
interface JourneyRepository: Neo4jRepository<Journey, String> {

    @Query(
    "MATCH (c:Carrier)-[lco:OPERATES]->" +
        "(l:Line)-[jlp:PERFORMS]->" +
        "(j:Journey)-[jtc:CONTAINS]->" +
        "(t:Trip)-[tss:STOPS]->" +
        "(stp:Stop)-[at:AT]->" +
        "(stn:Station)-[sit:SITUATED]->" +
        "(stnl:Location) " +
    "MATCH (per:Period)<-[v:VALID]-(sch:Schedule)<-[m:MAINTAINS]-(j) " +
    "MATCH (d:Location)<-[jd:DEPARTS]-(j) " +
    "MATCH (a:Location)<-[ja:ARRIVES]-(j) " +
    "WHERE d.name = \$departure AND a.name = \$arrival " +
    "RETURN j," +
    "collect(jlp)," +
    "collect(l)," +
    "collect(lco)," +
    "collect(c)," +
    "collect(d)," +
    "collect(jd)," +
    "collect(a)," +
    "collect(ja)," +
    "collect(jtc)," +
    "collect(t)," +
    "collect(tss)," +
    "collect(stp)," +
    "collect(at)," +
    "collect(stn)," +
    "collect(sit)," +
    "collect(stnl)," +
    "collect(m)," +
    "collect(sch)," +
    "collect(v)," +
    "collect(per)"
    )
    fun findByDepartureAndArrival(departure: String, arrival: String): List<Journey>
}