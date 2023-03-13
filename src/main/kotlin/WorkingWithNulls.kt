fun main() {
    fun describeString(maybeString: String?): String {
        return if (!maybeString.isNullOrEmpty()) {
            "String of length ${maybeString.length}"
        } else {
            "Empty or null string"
        }
    }

    println(describeString("I'm a software developer"))

    println(describeString(null))

    println(describeString(""))
}