import java.util.HashSet;

public class LeetCodeLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];

        int i = 0;
        int j = 0;

        int longest = 0;
        HashSet<Character> hashSet = new HashSet<>();

        while(j < s.length()){
            if(!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                j++;
                longest = Math.max(hashSet.size(), longest);
            }else {
                hashSet.remove(s.charAt(i));
                i++;
            }
        }
        return longest;
    }
}
