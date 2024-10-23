# DESAFIO TÉCNICO – Estágio - Ribeirão Preto
## Objetivo
<p align="center">
  <img width="140" src="https://github.com/user-attachments/assets/0c3c58d3-44c9-4d22-b24c-fe9e87acf0ce">
  <img width="180" src="https://github.com/user-attachments/assets/a292a77f-0981-4095-9d14-498c41b3c04d">
</p>

**Candidado: Diogo Montalvão**

Parte do processo seletivo do programa de estágio em desenvolvimento da Target Sistemas - Ribeirão Preto.

Linguagem utilizada: Kotlin

## Desafios

1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

Solução: https://github.com/DiogoMontalvao/desafio-tecnico-estagio-target/blob/efc8005f6aabd1eff7e8996318b835ba530db301/src/main/kotlin/sequencia-fibonacci.kt
##
2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

Solução: https://github.com/DiogoMontalvao/desafio-tecnico-estagio-target/blob/efc8005f6aabd1eff7e8996318b835ba530db301/src/main/kotlin/verificaLetraA.kt
##
3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); Ao final do processamento, qual será o valor da variável SOMA?

Resultado: 77
##
4) Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, ___

b) 2, 4, 8, 16, 32, 64, ____

c) 0, 1, 4, 9, 16, 25, 36, ____

d) 4, 16, 36, 64, ____

e) 1, 1, 2, 3, 5, 8, ____

f) 2,10, 12, 16, 17, 18, 19, ____

Respostas: a) 9; b) 128; c) 49; d) 100; e) 13; f) 200.
##
5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

Resposta: 

Primeiro: Ligar o interruptor A por alguns minutos, desligar o interruptor A, ligar o B e manter o C desligado.

Ir até a primeira sala: Se a lâmpada estiver quente e apagada é o interruptor A; se estiver acesa, interruptor B; se estiver fria e apagada, interruptor C. Supondo que a lâmpada estava acesa, a lâmpada pertence ao interruptor B.

Ir até a segunda sala: Se a lâmpada estiver quente e apagada é o interruptor A; se estiver fria e apagada, interruptor C. Supondo que estava fria e apagada, a lâmpada pertence ao interruptor C.

Por consequência, a lâmpada restante pertence ao interruptor A.
