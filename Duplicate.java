import java.util.HashSet;

class Duplicate{
    public boolean hasDuplicate(int[] nums) {
        //create HashSet to store elements from the array
        HashSet<Integer> seenNumbers = new HashSet<>();
        //iterate through each element in the array
        for (int num:nums)  {
            //check if element is already in the HashSet
            if (seenNumbers.contains(num)) {
                return true; //duplicate found
            }
            seenNumbers.add(num); //add the element to the HashSet
        }
        return false;//no duplicates found
    }
}