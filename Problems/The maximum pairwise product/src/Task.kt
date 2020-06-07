import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLine().toInt()

    val ms = mutableListOf<Int>()
    for (i in 1..n) {
        ms.add(scanner.nextInt())
    }

    var result: Int = 0
    result = if (n == 1) {
        ms[0]
    } else {
        ms.sortDescending()
        ms[0] * ms[1]
    }

    println(result)
}