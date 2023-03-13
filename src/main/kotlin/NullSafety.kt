fun main() {
    var neverNull: String = "This can't be null"
//    neverNull = null compiler error

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
//    inferredNonNull = null compiler error

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
//    println(strLength(nullable)) compiler error

    if (nullable != null) {
        println("strLength(nullable) = ${strLength(nullable)}")
    }

    nullable = "Now it has a value"

    if (nullable != null) {
        println("strLength(nullable) = ${strLength(nullable)}")
    }
}