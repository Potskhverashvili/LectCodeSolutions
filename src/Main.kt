fun main() {
    val s = "III"
    val s2 = "MCMXCIV"

    println(romanToInt(s))
}

fun romanToInt(s: String): Int {
    var currentValue: Int
    var nextValue: Int

    var currentSymbol: String
    var nextSymbol: String

    var result = 0
    var i = 0

    while (i < s.length - 1) {//"III"

        currentSymbol = s[i].toString() // M
        nextSymbol = s[i + 1].toString() // X

        currentValue = romanValues[currentSymbol] ?: 0
        nextValue = romanValues[nextSymbol] ?: 0

        if (currentValue < nextValue) {
            result += nextValue - currentValue
            i++
        } else {
            result += currentValue
        }
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

