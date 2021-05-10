package kopy

import copy
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ListCopyTest {

    @Test
    fun `test list copy extension function`() {
        val original = listOf("hello", "world")
        val copy = original.copy()

        assertEquals(original, copy)
    }

    @Test
    fun `test list copy extension function with transformation`() {
        val expected = listOf("HELLO", "WORLD")
        val original = listOf("hello", "world")
        val copy = original.copy {
            it.toUpperCase()
        }

        assertEquals(expected, copy)
    }
}