import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    scanner.nextLine()
    var result = 0
    for (i in 1..count) {
        result += scanner.nextInt()
    }
    println(result)
}