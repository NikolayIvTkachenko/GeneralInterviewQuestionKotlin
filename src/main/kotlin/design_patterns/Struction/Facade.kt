package design_patterns.Struction

import java.io.File

fun main() {



}


interface GameWorld

fun loadGame(file: File): GameWorld {
    return World001()
}

class World001(): GameWorld