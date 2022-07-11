//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
// Input: nums = [1,1]
//Output: [2]
// Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

import java.util.ArrayList;
public class DisappearedNumbers {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = findDisappearedNumbers(nums);
            System.out.print(ans);
    }

    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int original[] = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            original[i] = i+1; // creating numbers from 1 to array length
        }

        for(int j=0; j<nums.length; j++) {
            original[nums[j] -1] = 0; // nums[4]-1 = 8-1 = 7 // original[7] = 0
        }

        for(int k=0; k<nums.length; k++) {
            if(original[k] != 0) // index 4 & 5 will not become zero
                result.add(k+1); // indexes + 1 = 5,6
        }
        return result;
    }
}
