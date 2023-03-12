import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {
    @Test
    fun sum() {
        assertEquals(4, sum(2, 2))
        assertEquals(12, sum(8, 4))
    }

    @Test
    fun multiply() {
        assertEquals(10, multiply(5, 2))
        assertEquals(24, multiply(3,8))
    }
}