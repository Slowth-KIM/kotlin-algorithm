package programmers.level01

fun main(){
    var sol: Solution = Solution()

    println(sol.solution(3))
    println(sol.solution(4))

}

class Solution {
    fun solution(num: Int): String = if (num % 2 != 0) "Odd" else "Even"
}