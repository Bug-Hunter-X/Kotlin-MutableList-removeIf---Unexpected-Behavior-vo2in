fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 2) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 2]
    val iterator2 = list.iterator()    
    while (iterator2.hasNext()) {
        if (iterator2.next() < 3) {
            iterator2.remove() 
        }
    }
    println(list) // Output: []
}