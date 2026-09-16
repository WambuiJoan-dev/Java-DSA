class Palindrome{
    public boolean isPalindrome (String s) {
        //initialising one pointer to the left and one to the right
        int left = 0;
        int right = s.length() - 1;

        while(left<right) {
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


    //Time O(n) Space 0(1)
