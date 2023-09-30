fun main() {
    println("Кол-во разных символов в строке по алфавиту: " + vtoraya(readln()))
}
fun vtoraya(string: String): String {
    var result = ""
    val charCount = mutableMapOf<Char, Int>()
    string.forEach { char ->
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }
    charCount.toSortedMap().forEach { (char, count) ->
        result += "$char - $count\n"
    }
    return result
}