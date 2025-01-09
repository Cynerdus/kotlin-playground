import java.util.Collections


fun sum(a: Int, b: Int): Int = a + b
fun randomizeArray(size: Int): List<Int> = (1..size).map { (0..100).random() }
fun isEven(a: Int): Boolean = a % 2 == 0

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    println(arr.asList())

    // apply sum as lambda for map
    val arrModified = arr.map { sum(it, 1) }

    // 'it' is default name for lambda parameter
    arrModified.forEach(::println)
    println(arrModified.stream().reduce(0, Integer::sum))

    // '..' is range operator
    val randomArr1 = randomizeArray(10)
    println(randomArr1)
    Collections.sort(randomArr1)
    println(randomArr1)

    val randomArr2 = randomizeArray(10)
    println(randomArr2)
    println(randomArr2.sorted())
    println(randomArr2.sortedDescending())
    println(randomArr2.sortedBy { !isEven(it) })
}