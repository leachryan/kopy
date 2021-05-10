fun <T> List<T>.copy(mapper: ((T) -> T)): List<T> = this.map { mapper(it) }
fun <T> List<T>.copy() = this.map { it }