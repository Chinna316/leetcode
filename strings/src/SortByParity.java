// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
// nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
public class SortByParity {
    public static void main(String[] args) {
        int nums[] = {3,1,2,4};
        int result[] = sortArrayByParity(nums);
        for(int k=0; k<nums.length; k++)
            System.out.print(result[k]);
    }
    public static int[] sortArrayByParity(int[] nums) {
        int num[] = new int[nums.length];
        int t =0;
        int l = nums.length-1;
        for(int i=0; i<nums.length; i++) {

            if(nums[i]%2 == 0 ) {
                num[t] = nums[i];
                t++;
            }

            else {
                num[l] = nums[i];
                l--;
            }

        }
        for(int j=0; j<nums.length; j++)
            nums[j] = num[j];

        return nums;
    }
}
