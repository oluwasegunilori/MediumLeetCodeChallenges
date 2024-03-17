package solutions

class Solution {
    var low = 0
    var maxLen = 0
    fun solution(s: String): String {
        if(s.length <= 2 ) {
            return s
        }
        for (i in 0 until s.length - 1) {
            getPalindromeRange(s, i,i) // For odd length
            getPalindromeRange(s, i, i+1) // For even length
        }
        return s.substring(low, maxLen + low)
    }

    private fun getPalindromeRange(s: String, point1: Int, point2: Int) {
        var i = point1
        var j = point2
        //As we move forward and backward we need to verify that we are
        //each char is the same to get the longest palindrome in a string
        while(i>=0 && j<s.length && s[i] == s[j]) {
            i--
            j++
        }
        if(maxLen < (j-i-1)) {
            low = i+1 // Adding +1 because i will be 1 lower to cut out of the loop
            maxLen = j-i-1
        }
    }
}
fun main(args: Array<String>) {
    Solution().solution("babad")
}