import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val end = scanner.nextInt()

    for (i in start..end) {
        when {
            i % 15 == 0 -> {
                println("FizzBuzz")
            }
            i % 3 == 0 -> {
                println("Fizz")
            }
            i % 5 == 0 -> {
                println("Buzz")
            }
            else -> {
                println(i)
            }
        }
    }
}