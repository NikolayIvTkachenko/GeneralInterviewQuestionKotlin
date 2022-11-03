package kotlin_language

class State(var x: Int = 0, var  y: Int = 0)


fun main() {
    val state = State()

    val t1 = Thread ({
        state.x = 1
        println(state.y)
    })

    val t2 = Thread({
        state.y = 1
        println(state.x)
    })


    t1.start()
    t2.start()

    t1.join()
    t2.join()
}