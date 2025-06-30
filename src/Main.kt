fun main() {
    val s = "III"
    val s2 = "LVIII"

    println(romanToInt(s2))

}


fun romanToInt(s: String): Int {
    var currentValue : Int
    var currentSymbol : String
    var result = 0
    var i = 0
    while (i < s.length) {
        currentSymbol = s[i].toString()
        currentValue = romanValues[currentSymbol] ?: 0
        result += currentValue
        i++
    }
    return result
}

val romanValues = mapOf(
    "I" to 1,
    "V" to 5,
    "X" to 10,
    "L" to 50,
    "C" to 100,
    "D" to 500,
    "M" to 1000
)

