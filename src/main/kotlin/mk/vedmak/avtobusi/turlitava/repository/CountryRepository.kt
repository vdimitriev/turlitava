package mk.vedmak.avtobusi.turlitava.repository

import mk.vedmak.avtobusi.turlitava.model.Country
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
interface CountryRepository: Neo4jRepository<Country, String>