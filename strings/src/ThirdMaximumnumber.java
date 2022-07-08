// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
// Input: nums = [3,2,1]
//Output: 1
//Explanation:
//The first distinct maximum is 3.
//The second distinct maximum is 2.
//The third distinct maximum is 1.

public class ThirdMaximumnumber {
    public static void main(String[] args) {
        int nums[] = {2,2,3,1};
        System.out.print(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Integer max1 = Integer.MIN_VALUE; // minimum number(-2121324)
        Integer max2 = Integer.MIN_VALUE;
        Integer max3 = Integer.MIN_VALUE;
        int c =0;
        for(int i=0; i<nums.length; i++) {
            max1 = Math.max(max1, nums[i]);
        }
        for(int j=0; j<nums.length; j++) {
            if((max2<nums[j]) && (nums[j] != max1))
                max2 = nums[j];
        }
        for(int k=0; k<nums.length; k++) {
            if((max3 <= nums[k]) && (nums[k] != max2) && (nums[k] != max1)){
                max3 = nums[k];
                c++; // if this loop runs, count will increase
            }
        }
        if (c ==0) // if count doesnt increase max3 = max1
            max3 = max1;
        return max3;
    }
}
