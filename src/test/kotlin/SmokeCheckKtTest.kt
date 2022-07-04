import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SmokeCheckKtTest {

    @Test
    fun `test Cat + Dog returns CatDog`() {

        val catDog = "Cat".SmokeCheck("Dog")
        assertEquals("CatDog", catDog)

    }
}