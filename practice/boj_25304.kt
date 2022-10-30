import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val N = readLine().toInt()
    val num = readLine().toInt()
    var total = 0
    for (i in 0 until num){
        val st = StringTokenizer(readLine(), " ")
        total += (st.nextToken().toInt() * st.nextToken().toInt())
    }
    if(total == N){
        bw.append("Yes")
    } else{
        bw.append("No")
    }
    bw.flush()
    bw.close()
}