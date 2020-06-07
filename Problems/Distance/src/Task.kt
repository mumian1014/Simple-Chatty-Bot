import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val miles = scanner.nextLine().toInt()
    val time = scanner.nextInt()
    val result = miles.toDouble() / time.toDouble()
    println(result)
}