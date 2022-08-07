package design_patterns.Construction

import javax.lang.model.type.UnionType

fun main() {

    println("Introduction to generics in Kotlin")

    class Cat

    val box = Box<Cat>()

    box.put(Cat())
    val cat = box.get()
    


}

class Box<T> {
    private var inside: T? = null
    fun put (t: T) {
        inside = t
    }

    fun get(): T? = inside
}


interface Building<in UnitType, out ProducedUnit> where UnitType : Enum<*>, ProducedUnit : Unit {
    fun build(type: UnitType) : ProducedUnit
}