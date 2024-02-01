package org.example

import Lampada

fun main() {
    println("LÀMPADA CUINA")
    val lampara1 = Lampada("Cuina")
    lampara1.encendre()
    repeat(3) {
        lampara1.canviarColor() }
    repeat(4) {
        lampara1.canviarIntensitat()
    }

    println()
    println("LÀMPADA DORMITORI")
    val lampara2 = Lampada("Dormitori")
    lampara2.encendre()
    repeat(2) {
        lampara2.canviarColor() }
    repeat(4){
        lampara2.canviarIntensitat()
    }
    lampara2.apagar()
    lampara2.canviarColor()
    lampara2.encendre()
    lampara2.canviarColor()
    lampara2.canviarIntensitat()
}