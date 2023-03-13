class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val mutableStack = MutableStack(3.14, 4.18, 10.5, 1.2, 0.68)
    mutableStack.push(5.55)
    println(mutableStack.toString())

    println(mutableStack.peek())

    mutableStack.pop()
    println(mutableStack.toString())
    println(mutableStack.pop())

    println(mutableStack.isEmpty())

    println(mutableStack.size())

    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}