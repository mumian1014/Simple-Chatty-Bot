import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first = scanner.nextLine().toDouble()
    val second = scanner.nextDouble()
    val result = second - first
    println(result)
}