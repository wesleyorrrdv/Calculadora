fun main() {
    print("Digite o primeiro numero:")
    val num1 = readLine()?.toIntOrNull()?: return

    print("Digite o segundo numero:")

    val num2 = readLine()?.toIntOrNull()?: return

    val soma = num1+num2

    println("A soma é: $soma")

}