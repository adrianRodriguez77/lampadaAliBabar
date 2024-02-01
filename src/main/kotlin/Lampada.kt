class Lampada {
    private var id = ""
    private var encesa = false
    private var color = 0
    private var intensitat = 0

    private val colors = arrayOf("$WHITE blanc $RESET", "$YELLOW groc $RESET", "$PURPLE lila $RESET", "$ORANGE taronja $RESET")
    private var ultimColor = "blanc"
    private var ultimaIntensitat = 0

    constructor(id: String) {
        this.id = id
    }

    fun encendre() {
        encesa = true
        if (ultimaIntensitat == 0) {
            color = 0
            intensitat = 1
        } else {
            color = colors.indexOf(ultimColor)
            intensitat = ultimaIntensitat
        }
        mostrarEstat()
    }

    fun apagar() {
        encesa = false
        ultimColor = colors[color]
        ultimaIntensitat = intensitat
        mostrarEstat()
    }

    fun canviarColor() {
        if (encesa) {
            color = (color + 1) % colors.size
            mostrarEstat()
        } else {
            println("La làmpada està apagada.")
        }
    }

    fun canviarIntensitat() {
        if (encesa) {
            intensitat += 1
            if (ultimaIntensitat == 5) {
                println("Ja està a la màxima intensitat")
                intensitat = 5
            }
            mostrarEstat()
        } else {
            println("La làmpada està apagada.")
        }
    }

    fun mostrarEstat() {
        if (encesa) {
            println("Encesa - ${colors[color]} - Intesitat: $intensitat")
        } else {
            println("Apagada")
        }
    }
}
