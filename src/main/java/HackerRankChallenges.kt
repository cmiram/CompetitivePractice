import java.util.*
import kotlin.math.abs
import kotlin.math.min

fun arrayLeftRotation(a: Array<Int>, d: Int): String {
    return (d until d+a.size).map { a[it%a.size] }.joinToString(" ")
}

// 2 <= n <= 100
// 0 < a[i] < 100
fun pickingNumbers(a: Array<Int>): Int {
    val counts = a.toSet().associateWith { key -> a.count { key == it } }
    return counts.keys.asSequence()
        .map { (it-1 until it+1) }
        .map { it.sumBy { key -> counts.getOrDefault(key,0) } }
        .max() ?: 0
}

// 1 <= i <= j <= 20e6
// 1 <= k <= 20e9
fun beautifulDays(i: Int, j: Int, k: Int): Int {
    return (i..j).asSequence()
        .map { Pair(it, it.toString().reversed().toInt()) }
        .map { abs(it.first - it.second) }
        .filter { it%k == 0 }
        .count()
}

// n: # prisoners
// m: # sweets
// s: start position
// n: 3, m: 7, s: 3 -> 2
// 0 1 2
fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    val sweets = m % n
    val posToWarn = if (sweets == 0 && s == 1) return n else s + sweets - 1
    return if (posToWarn > n) posToWarn - n else posToWarn
}

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    class MutPair<T,V>(var first: T, var second: V)
    
    if (scores.size < 2) return arrayOf(0, 0)
    // track min/max as pair of (value, newRecordCount)
    val min = MutPair(scores[0], 0)
    val max = MutPair(scores[0], 0)
    for (score in scores) {
        if (score < min.first) {
            min.first = score
            min.second += 1
        } else if (score > max.first) {
            max.first = score
            max.second += 1
        }
    }
    return arrayOf(max.second, min.second)
}

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    return (0..s.size-m).asSequence()
            .filter { s.sliceArray(IntRange(it, it+m-1)).sum() == d }
            .count()
}

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
    val calendar = GregorianCalendar()
    calendar.gregorianChange = Date(Calendar.Builder().setDate(1918, 2, 14).build().timeInMillis)
    calendar.set(Calendar.YEAR, year)
    calendar.set(Calendar.DAY_OF_YEAR, 256)
    val format = "%02d.%02d.%04d"
    return String.format(format, calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR))
}

/*
 * Complete the pageCount function below.
 */
fun pageCount(n: Int, p: Int): Int {
    return if(n-p == 1 && n%2 == 0 && n != 2) 1 else min(p/2, (n-p)/2)
}