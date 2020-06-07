import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextDouble()
    println((0..3).map { num.pow(it) }.sum())
}