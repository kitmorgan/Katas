public class leetCodeLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        int longestSub = 1;

        char[] sArray = s.toCharArray();
        for(int startIndex = 0; startIndex < s.length() - 2;) {
            int currentLength = 1;
            for (int i = 2; i < s.length() - 1; i++) {
                if(sArray[startIndex] == sArray[i]){
                   currentLength ++;
                }
                if(currentLength >= longestSub){
                    longestSub = currentLength;
                }
                if (sArray[startIndex] != sArray[i]) {
                    startIndex+= currentLength;
                    break;
                }
            }
        }
        return longestSub;
    }
}
