fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}

fun log(vararg entries: String) {
    printAll(*entries)
}

fun main() {
    printAll("Hello", "Hallo", "Salut", "Hola", "Rola que tarl?")

    printAllWithPrefix("Hello", "Ola", "Hola", prefix = "Greeting: ")

    log("Hello", "Hola", "Ola", "Eai meu confederado")
}