
fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val str = readLine()
    bw.append("$str??!")
    bw.flush()
    bw.close()
}