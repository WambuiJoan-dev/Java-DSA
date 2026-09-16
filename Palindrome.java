class Palindrome{
    public boolean isPalindrome (String s) {
        //initialising one pointer to the left and one to the right of the string
        int left = 0;
        int right = s.length() - 1;

        while(left<right) { //run a loop while left is less than right
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++; //if value of left side is not alphanumeric then update the left pointer(increase)
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--; //if value of left side is not alphanumeric then update the left pointer(reduce)
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){//check if they are same values
                return false; //return false if they're not matching after converting to lowercase
            }
            left++; //update values of left and right pointer
            right--;
        }
        return true;
    }
}


    //Time O(n) Space 0(1)
