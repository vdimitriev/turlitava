package mk.vedmak.avtobusi.turlitava.repository

import mk.vedmak.avtobusi.turlitava.model.Carrier
import mk.vedmak.avtobusi.turlitava.model.Employee
import org.springframework.data.neo4j.repository.Neo4jRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository: Neo4jRepository<Employee, Long> {
}