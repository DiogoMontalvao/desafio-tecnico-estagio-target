import java.text.Normalizer

fun main() {
    runApp()
}

private fun runApp() {
    while (true) {
        print("\nDigite a string para a verificação: ")
        val inputString = readln().removeAcentos()

        printVerificaLetraA(inputString)
    }
}

private fun String.removeAcentos(): String {
    val novaString = Normalizer.normalize(this, Normalizer.Form.NFD)

    return novaString.replace("\\p{M}".toRegex(), "")
}

private fun printVerificaLetraA(inputString: String) {
    if (inputString.naoContemA()) {
        println("A string digitada não contém a letra A.")
        return
    }

    val frequenciaLetraA = frequenciaLetraA(inputString)
    println("A letra \"a\" aparece $frequenciaLetraA vezes.")
}

private fun String.naoContemA() =
    this.indexOf("a", ignoreCase = true) == -1

private fun frequenciaLetraA(inputString: String): Int {
    var counter = 0

    inputString.forEach { word ->
        val wordUpperCase = word.uppercase()
        if (wordUpperCase == "A") counter++
    }

    return counter
}

