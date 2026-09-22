import java.util.HashSet;

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
       //checking edge cases
        if  (s ==  null || s.length() ==0){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }
        int left = 0;
        int right = 0;
        int ans = 0;
        //initialise a hashset
        HashSet<Character> set = new HashSet<>();
    }
}