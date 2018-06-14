import java.util.*

fun main(args: Array<String>) {
    var sum: Int = 0
    for (i in 0 until args.size)
        sum += args[i].toInt()
    println(sum.toDouble() / args.size) // 1

    for (i in 1..10)
        print("${Random().nextInt()} ") // 2

    val a = Array<Array<Int>>(3){
        _: Int -> Array<Int>(3){
            _: Int -> Random().nextInt() % 100
        }
    }
    for (i in 0..2) {
        for (j in 0..2)
            print("${a[i][j]} ") // 3
        println()
    }

    for (j in 0..2) {
        for (i in 2 downTo 0)
            print("${a[i][j]} ") // 4
        println()
    }
}