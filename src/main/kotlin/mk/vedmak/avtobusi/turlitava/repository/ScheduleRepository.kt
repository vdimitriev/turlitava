package mk.vedmak.avtobusi.turlitava.repository

import mk.vedmak.avtobusi.turlitava.model.Schedule
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface ScheduleRepository: Neo4jRepository<Schedule, String>