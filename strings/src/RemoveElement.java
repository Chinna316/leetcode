import java.util.Scanner;
import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int j=0; j<nums.length; j++) {
            nums[j] = input.nextInt();
        }
        int val = input.nextInt();
        remove(nums, val);
    }
        public static int remove(int[] nums, int val) {
        int t = 0;
        for(int i =0; i<nums.length; i++) {
            if(nums[i - t] == val) {
                for(int h = i-t; h < nums.length - 1; h++){
                    nums[h] = nums[h + 1];
                }
                t++;
            }
        }
        return (nums.length) - t;
    }
}

