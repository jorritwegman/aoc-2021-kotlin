import java.util.*

fun main(args: Array<String>) {
    val input = readInput("d01").map { s -> s.toInt() }
    println(part2(input))
}

fun part1(input: List<Int>): Int {
    var prev = input[0]
    var ind = 1
    var c = 0
    while (ind < input.size) {
        if (input[ind] > prev) {
            c++
        }
        prev = input[ind]
        ind++
    }
    return c
}

fun frame(input: List<Int>, ind: Int): Int = input.subList(ind, ind + 3).sum()

fun part2(input: List<Int>): Int {
    var prev = frame(input, 0)
    var ind = 1
    var c = 0
    while (ind < input.size - 2) {
        if (frame(input, ind) > prev) {
            c++
        }
        prev = frame(input, ind)
        ind++
    }
    return c
}