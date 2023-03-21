fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)
    println(authors === writers)

    val authorsReference = authors
    println(authors === authorsReference)

    val authorDeepCopy = authors.toSet()
    println(authors === authorDeepCopy)
}