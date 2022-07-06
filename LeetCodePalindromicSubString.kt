
fun main(){
  val method = LeetCodePalindromicSubString()
    println(method.longestPalindrome("abcdeffed"))
}
class LeetCodePalindromicSubString {
    fun longestPalindrome(s: String): String {
        if(s == null || s.length < 1) return ""
        var start = 0
        var end = 0
        for (i in 0.. s.length){
            var len1 = expandAroundCenter(s,i,i)
            var len2 = expandAroundCenter(s, i, i+1)
            var len = kotlin.math.max(len1, len2)
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len /2;
            }
        }
        return s.substring(start, end+1)
    }

    fun expandAroundCenter(s: String, i: Int, j: Int): Int{
        var L = i
        var R = j
        while(L >= 0 && R < s.length && s[L] == s[R]){
            L--;
            R++;
        }
        return R - L - 1
    }
}