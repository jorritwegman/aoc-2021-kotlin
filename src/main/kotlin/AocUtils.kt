import java.io.File

fun readInput(name: String) = File("src/main/input", "$name.txt").readLines()