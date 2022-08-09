package design_patterns.Struction

fun main() {

    val miller = RiflemanV2()
    val caparzo = RiflemanV2()
    val jackson = RiflemanV2()

    val squad = Squad()

    squad.infantryUnits.add(miller)
    squad.infantryUnits.add(caparzo)
    squad.infantryUnits.add(jackson)

    println(squad.infantryUnits.size)

    val squad002 = Squad(miller, caparzo, jackson)

}

interface InfantryUnit

class RiflemanV2 : InfantryUnit

class Sniper : InfantryUnit

class Squad(val infantryUnits: MutableList<InfantryUnit> = mutableListOf()) {

    constructor(first: InfantryUnit) : this(mutableListOf()) {
        this.infantryUnits.add(first)
    }

    constructor(first: InfantryUnit, second: InfantryUnit) : this(first) {
        this.infantryUnits.add(second)
    }

    constructor(first: InfantryUnit, second: InfantryUnit, third: InfantryUnit) : this(first, second) {
        this.infantryUnits.add(third)
    }

}