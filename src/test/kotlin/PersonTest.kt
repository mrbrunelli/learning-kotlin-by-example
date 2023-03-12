import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PersonTest {

    @Test
    fun getLikedPeople() {
        val maria = Person("Maria")
        val joao = Person("João")
        maria likes joao
        assertEquals(1, maria.likedPeople.size)
        assertEquals(joao, maria.likedPeople.find { person -> person.name === "João" })
    }
}