class Node<T>(val item: T) {
    var link: Node<T>? = null
}

fun <T> getMiddle(start: Node<T>?): Node<T>? {
    if (start == null) return null

    var slowPointer = start
    var fastPointer = start

    while (fastPointer?.link != null && fastPointer.link?.link != null) {
        slowPointer = slowPointer?.link
        fastPointer = fastPointer.link?.link
    }

    return slowPointer
}
