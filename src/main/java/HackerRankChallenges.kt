package main.java

import kotlin.math.abs

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
