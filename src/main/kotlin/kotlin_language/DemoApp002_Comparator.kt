package kotlin_language

fun main() {
    val list = listOf("aa", "b", "bb", "a")

    val sorted = list.sortedWith(compareBy(
        { it.length },
        { it }
    ))

    println(sorted) // [a, b, aa, bb]
}

