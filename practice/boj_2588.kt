package algorithm

fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine().toInt()
    val b = readLine().toInt()
    val bw = System.out.bufferedWriter()
    val c = a * (b % 10)
    val d = a * ((b % 100) / 10)
    val e = a * (b / 100)
    val f = a * b
    bw.appendLine("$c")
    bw.appendLine("$d")
    bw.appendLine("$e")
    bw.appendLine("$f")
    bw.flush()
    bw.close()
}
