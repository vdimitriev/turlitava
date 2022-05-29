package mk.vedmak.avtobusi.turlitava.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class LocationServiceIT {

    @Autowired
    private lateinit var locationService: LocationService

    @Test
    fun searchByTermLatinCapitalizedFullName() {
        val term = "Bitolа"
        val locations = locationService.searchByTerm(term)
        Assertions.assertTrue(locations.isNotEmpty())
        locations.forEach {
            println(it)
        }
    }

    @Test
    fun searchByTermLatinCapitalizedNotFullName() {
        val term = "Bito"
        val locations = locationService.searchByTerm(term)
        Assertions.assertTrue(locations.isNotEmpty())
        locations.forEach {
            println(it)
        }
    }

    @Test
    fun searchByTermLatinNonCapitalizedFullName() {
        val term = "bitolа"
        val locations = locationService.searchByTerm(term)
        Assertions.assertTrue(locations.isNotEmpty())
        locations.forEach {
            println(it)
        }
    }

    @Test
    fun searchByTermLatinNonCapitalizedNotFullName() {
        val term = "r"
        val locations = locationService.searchByTerm(term)
        Assertions.assertTrue(locations.isNotEmpty())
        locations.forEach {
            println(it)
        }
    }

    @Test
    fun searchByTermCyrillicCapitalizedFullName() {
        val term = "Битола"
        val locations = locationService.searchByTerm(term)
        Assertions.assertTrue(locations.isNotEmpty())
        locations.forEach {
            println(it)
        }
    }

    @Test
    fun searchByTermCyrillicNonCapitalizedFullName() {
        val term = "битола"
        val locations = locationService.searchByTerm(term)
        Assertions.assertTrue(locations.isNotEmpty())
        locations.forEach {
            println(it)
        }
    }

    @Test
    fun searchByTermCyrillicCapitalizedNotFullName() {
        val term = "Бито"
        val locations = locationService.searchByTerm(term)
        Assertions.assertTrue(locations.isNotEmpty())
        locations.forEach {
            println(it)
        }
    }

    @Test
    fun searchByTermCyrillicNonCapitalizedNotFullName() {
        val term = "бито"
        val locations = locationService.searchByTerm(term)
        Assertions.assertTrue(locations.isNotEmpty())
        locations.forEach {
            println(it)
        }
    }
}