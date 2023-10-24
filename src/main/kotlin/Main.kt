fun main() {
    print("Введите строку: ")
    val inputString = readLine()?.toUpperCase()

    if (inputString != null) {
        val charMap = mutableMapOf<Char, Int>()

        for (char in inputString) {
            val count = charMap[char]
            if (count == null) {
                charMap[char] = 1
            } else {
                charMap[char] = count + 1
            }
        }

        val sortedMap = charMap.toSortedMap()

        for ((char, count) in sortedMap) {
            println("$char - $count")
        }
    }
}
