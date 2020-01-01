package main.java

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val nCases = scanner.nextInt()
    val sols = MutableList(nCases) {""}
    for (i in sols.indices) {
        val input = scanner.nextInt()
        sols[i] = HardSequence.solve(input)
    }
    for(sol in sols) println(sol)
}

object HardSequence {

    private val counts = arrayOf("")

    fun solve(t: Int): String {
        return counts[t-1]
    }

}

fun generateCounts(max: Int = 128) {
    val seq = (0 until max).map { 0 }.toMutableList()
    val counts = mapOf(Pair(0, mutableListOf(0)))
    for (i in 1 until max) {
        val prev = seq[i-1]
        if (!counts.containsKey(prev)) {
            seq[i] = 0

        }
    }
    val cntStrs = counts.mapValues { it.value.toString() }
    print(cntStrs.size)
}

abstract class CodeChefSolution<in T, V> (
    private val formatSol: (V) -> String = { it.toString() }
) {

    abstract fun solveImpl(arg: T): V

    fun solve(arg: T): String {
        val sol = solveImpl(arg)
        return formatSol(sol)
    }

}
