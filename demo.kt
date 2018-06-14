import kotlin.math.sqrt

fun main(args: Array<String>)
{
    //Деш Рейноу 10 6 1 1 2 2

    println(format(args[0], args[1])) // 1

    println(args[2].toDouble() * args[3].toDouble()) // 2

    var str: String = readLine()!!
    println(str.split(" ")[0].toDouble() * str.split(" ")[1].toDouble()) // 3

    str = readLine()!!
    println(distance(str.split(" ")[0].toDouble(), str.split(" ")[1].toDouble(),
            str.split(" ")[2].toDouble(), str.split(" ")[3].toDouble())) // 4

    println(distance(args[4].toDouble(), args[5].toDouble(), args[6].toDouble(), args[7].toDouble())) // 5
}

fun format(arg1: String, arg2: String): String = "Фамилия: $arg1, Имя: $arg2"
fun distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))