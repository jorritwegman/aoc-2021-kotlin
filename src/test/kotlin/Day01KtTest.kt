import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day01KtTest {

    private val input = listOf<Int>(199,200,208,210,200,207,240,269,260,263,)

    @Test
    fun part1() {
        assertEquals(7, part1(input))
    }

    @Test
    fun part2() {
        assertEquals(5, part2(input))
    }
}