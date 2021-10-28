import kotlin.math.pow

fun main(args: Array<String>) {

    println("Bem vindo a calculadora, escolha a operação aritimética desejada: " +
            "\nDigite: 1 - Soma, 2 - Subtração, 3 - Divisão, 4 - Multiplicação, 5 - Potência")
    var escolha = readLine()!!

    println("Insira o seu primeiro número: ")
    var num1 = readLine()!!.toInt()

    println("Insira o seu segundo número: ")
    var num2 = readLine()!!.toInt()

    when(escolha){

        "1" -> soma(num1,num2)
        "2" -> subtracao(num1,num2)
        "3" -> divisao(num1.toDouble(),num2.toDouble())
        "4" -> multiplicacao(num1,num2)
        "5" -> potencia(num1.toDouble(),num2.toDouble())
    }

}
fun soma(num1: Int, num2: Int){
    var resultado = num1 + num2
    println("Soma do $num1 e do $num2 é igual a: $resultado")
}

fun subtracao(num1: Int, num2: Int){
    var resultado = num1 - num2
    println("A subtração do $num1 e do $num2 é igual a: $resultado")
}

fun divisao(num1: Double, num2: Double){
    var resultado = num1 / num2
    println("A divisão do $num1 pelo $num2 é igual a: $resultado")
}

fun multiplicacao(num1: Int, num2: Int){
    var resultado = num1 * num2
    println("A multiplicação do $num1 pelo $num2 é igual a: $resultado")
}

fun potencia(num1: Double, num2: Double){
    var resultado = num1.pow(num2)
    println("$num1 elevado a $num2 é igual a: $resultado")
}
