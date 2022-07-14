import java.util.Scanner;
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer values: ");
        int nums[] = new int[10];
        for(int j=0; j<nums.length; j++)
            nums[j] = input.nextInt();
        int[] result = removeDuplicates(nums);
        System.out.print("Passing duplicates to the end of an array: ");
        for(int h=0; h<result.length; h++)
        System.out.print(result[h]);


    }

        public static int[] removeDuplicates(int[] nums) {
            int k =0;
            for(int i=0; i<nums.length-1; i++) {
                if(nums[i] != nums[i+1]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            nums[k] = nums[nums.length-1];



            return nums;
        }
    }

