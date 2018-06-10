package exercises

//1. create an infix extensions function "power" that calculate a power of an Int
infix fun Int.power(a: Int): Int {
    var result = 1
    for (any in 1 .. a)
        result *= this
    return result
}

fun main(args: Array<String>) {
    //2. calculate 5^4
    val a = 5.power(4)

    //3. print the result
    println(a)
}

infix fun Int.power(a: Int): Int {
    var result = 1
    for (any in 1 .. a)
        result *= this
    return result
}