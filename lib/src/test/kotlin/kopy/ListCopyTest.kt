package kopy

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

    @Test
    fun `test array list inheriting copy extension function`() {
        val original = arrayListOf("Hello", "World")
        val copy = original.copy()

        assertEquals(original, copy)
    }

    @Test
    fun `test array list inheriting copy extension function with transformation`() {
        val expected = arrayListOf("hello", "world")
        val original = arrayListOf("Hello", "World")
        val copy = original.copy {
            it.toLowerCase()
        }

        assertEquals(expected, copy)
    }
}