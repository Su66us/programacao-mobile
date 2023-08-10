//
//fun main() {
//    // Solicita o nome e sobrenome ao usuário
//    print("Digite seu nome: ")
//    val nome = readLine()
//
//    print("Digite seu sobrenome: ")
//    val sobrenome = readLine()
//
//    // Imprime o nome e sobrenome na tela
//    println("Nome: $nome $sobrenom")
//
//}
//fun main() {
//    // Solicita a base e altura do retângulo ao usuário
//    print("Digite a base do retângulo: ")
//    val base = readLine()?.toDoubleOrNull()
//
//    print("Digite a altura do retângulo: ")
//    val altura = readLine()?.toDoubleOrNull()
//
//    if (base != null && altura != null) {
//        // Calcula a área e o perímetro
//        val area = base * altura
//        val perimetro = 2 * (base + altura)
//
//        // Imprime os resultados
//        println("Área do retângulo: $area")
//        println("Perímetro do retângulo: $perimetro")
//    } else {
//        println("Valores inválidos. Certifique-se de digitar números válidos.")
//    }
//}
//fun main() {
//    // Solicita os números ao usuário
//    print("Digite o primeiro número inteiro: ")
//    val numero1 = readLine()?.toIntOrNull()
//
//    print("Digite o segundo número inteiro: ")
//    val numero2 = readLine()?.toIntOrNull()
//
//    if (numero1 != null && numero2 != null) {
//        // Compara os números e encontra o maior
//        val maior = if (numero1 > numero2) numero1 else numero2
//
//        // Imprime o maior número
//        println("O maior número é: $maior")
//    } else {
//        println("Valores inválidos. Certifique-se de digitar números inteiros válidos.")
//    }
////}
//
//fun main() {
//        // Solicita um número ao usuário
//        print("Digite um número: ")
//        val numero = readLine()?.toIntOrNull()
//
//        if (numero != null) {
//            // Verifica se o número é múltiplo de 3 e 4
//            val multiploDe3 = numero % 3 == 0
//            val multiploDe4 = numero % 4 == 0
//
//            // Verifica se é múltiplo de ambos
//            if (multiploDe3 && multiploDe4) {
//                println("$numero é múltiplo de 3 e 4.")
//            } else {
//                if (multiploDe3) {
//                    println("$numero é múltiplo de 3.")
//                }
//                if (multiploDe4) {
//                    println("$numero é múltiplo de 4.")
//                }
//                if (!multiploDe3 && !multiploDe4) {
//                    println("$numero não é múltiplo de 3 nem de 4.")
//                }
//            }
//        } else {
//            println("Valor inválido. Certifique-se de digitar um número válido.")
//        }
//    }
//fun main() {
//    // Solicita o peso e a altura ao usuário
//    print("Digite o peso (kg): ")
//    val peso = readLine()?.toDoubleOrNull()
//
//    print("Digite a altura (metros): ")
//    val altura = readLine()?.toDoubleOrNull()
//
//    if (peso != null && altura != null) {
//        // Calcula o IMC
//        val imc = peso / (altura * altura)
//
//        // Classifica o IMC de acordo com a tabela
//        val classificacao = when {
//            imc < 18.5 -> "Abaixo do peso"
//            imc < 24.9 -> "Peso normal"
//            imc < 29.9 -> "Sobrepeso"
//            imc < 34.9 -> "Obesidade grau 1"
//            imc < 39.9 -> "Obesidade grau 2"
//            else -> "Obesidade grau 3"
//        }
//
//        // Imprime o IMC e a classificação
//        println("Seu IMC é: $imc")
//        println("Classificação: $classificacao")
//    } else {
//        println("Valores inválidos. Certifique-se de digitar pesos e alturas válidos.")
//    }
//}
//
//
//
//
//fun main() {
//    // Solicita um número de mês ao usuário
//    print("Digite um número de 1 a 12 correspondente a um mês: ")
//    val mesNumero = readLine()?.toIntOrNull()
//
//    if (mesNumero != null && mesNumero in 1..12) {
//        // Utiliza o comando when para determinar o nome do mês
//        val nomeMes = when (mesNumero) {
//            1 -> "Janeiro"
//            2 -> "Fevereiro"
//            3 -> "Março"
//            4 -> "Abril"
//            5 -> "Maio"
//            6 -> "Junho"
//            7 -> "Julho"
//            8 -> "Agosto"
//            9 -> "Setembro"
//            10 -> "Outubro"
//            11 -> "Novembro"
//            12 -> "Dezembro"
//            else -> "Mês inválido"
//        }
//
//        // Imprime o nome do mês
//        println("O número $mesNumero corresponde ao mês de $nomeMes.")
//    } else {
//        println("Número inválido. Digite um número entre 1 e 12.")
//    }
//}
//fun main() {
//    // Solicita um número inteiro positivo ao usuário
//    print("Digite um número inteiro positivo: ")
//    val n = readLine()?.toIntOrNull()
//
//    if (n != null && n > 0) {
//        var soma = 0.0
//
//        for (i in 1..n) {
//            soma += i.toDouble() / (n - i + 1)
//        }
//
//        // Imprime o valor da soma
//        println("O valor da soma é: $soma")
//    } else {
//        println("Número inválido. Digite um número inteiro positivo.")
//    }
////}
//fun main() {
//    // Solicita um número inteiro ao usuário
//    print("Digite um número inteiro: ")
//    val numero = readLine()?.toIntOrNull()
//
//    if (numero != null) {
//        if (numero >= 0) {
//            val fatorial = calcularFatorial(numero)
//            println("O fatorial de $numero é $fatorial")
//        } else {
//            println("Número inválido. Digite um número não negativo.")
//        }
//    } else {
//        println("Número inválido. Digite um número inteiro válido.")
//    }
//}
//
//fun calcularFatorial(n: Int): Long {
//    return if (n == 0 || n == 1) {
//        1
//    } else {
//        var resultado: Long = 1
//        for (i in 2..n) {
//            resultado *= i
//        }
//        resultado
//    }
////}
//fun calcularFatorial(n: Int): Long {
//    return if (n == 0 || n == 1) {
//        1
//    } else {
//        var resultado: Long = 1
//        for (i in 2..n) {
//            resultado *= i
//        }
//        resultado

//    }
//}
//
//fun main() {
//    // Solicita um número inteiro ao usuário
//    print("Digite um número inteiro: ")
//    val numero = readLine()?.toIntOrNull()
//
//    if (numero != null) {
//        if (numero >= 0) {
//            val fatorial = calcularFatorial(numero)
//            println("O fatorial de $numero é $fatorial")
//        } else {
//            println("Número inválido. Digite um número não negativo.")
//        }
//    } else {
//        println("Número inválido. Digite um número inteiro válido.")
//    }
////}
//fun calcularFatorial(n: Int): Long {
//    return if (n == 0 || n == 1) {
//        1
//    } else {
//        var resultado: Long = 1
//        for (i in 2..n) {
//            resultado *= i
//        }
//        resultado
//    }
//}
fun max(a: Double, b: Double): Double {
    return if (a > b) a else b
}

fun min(a: Double, b: Double): Double {
    return if (a < b) a else b
}

fun media(a: Double, b: Double): Double {
    return (a + b) / 2
}

fun main() {
    val num1 = 10.0
    val num2 = 20.0

    println("Maior valor: ${max(num1, num2)}")
    println("Menor valor: ${min(num1, num2)}")
    println("Média: ${media(num1, num2)}")
}