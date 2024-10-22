/**
 * 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
 * sempre será a soma dos 2 valores anteriores
 * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 * escreva um programa na linguagem que desejar onde,
 * informado um número, ele calcule a sequência de Fibonacci e retorne uma
 * mensagem avisando se o número informado pertence ou não a sequência.
 */

fun main() {
    runApp()
}

private fun runApp() {
    while (true) {
        val numeroDesejado = solicitaNumero() ?: return

        printPertenceFibonacci(numeroDesejado)
    }
}

private fun solicitaNumero(): Long? {
    print("Digite o número desejado: ")
    val numeroDesejado = readln().toLongOrNull()

    if (numeroDesejado == null) {
        println("Entrada inválida.")
        return null
    }

    return numeroDesejado
}

private fun printPertenceFibonacci(numeroDesejado: Long) {
    if (!pertenceFibonacci(numeroDesejado)) {
        println("O número não pertence à sequência de Fibonacci.\n")
        return
    }

    println("O número pertence à sequência de Fibonacci.\n")
}

private fun pertenceFibonacci(numeroDesejado: Long): Boolean {
    if (numeroDesejado == 0L) return true

    var numeroAtual = 0L
    var proximoNumero = 1L
    for (i in 1..numeroDesejado) {
        val temp = numeroAtual + proximoNumero
        numeroAtual = proximoNumero
        proximoNumero = temp

        if (proximoNumero == numeroDesejado) return true
        if (proximoNumero > numeroDesejado) return false
    }

    return false
}