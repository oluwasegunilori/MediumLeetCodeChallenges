package practt;

class Solution {
    var low = 0
    var maxlen = 0
    fun longestPalindrome(s: String): String {
        if(s.length <= 2 ) {
            return s
        }
        for (i in 0 until s.length - 1) {
            getPalindromeRange(s, i,i) // For odd le
            getPalindromeRange(s, i, i+1)
        }
        return s.substring(low, maxlen + low)
    }

    private fun getPalindromeRange(s: String, point1: Int, point2: Int) {
        var i = point1
        var j = point2
        while(i>=0 && j<s.length && s[i] == s[j]) {
            i--
            j++
        }
        if(maxlen < (j-i-1)) {
            low = i+1
            maxlen = j-i-1
        }
    }
}
fun main(args: Array<String>) {
    Solution().longestPalindrome("babad")
}