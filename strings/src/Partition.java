import java.util.Arrays;
import java.util.Scanner;
public class Partition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums[] = new int[10];
        for(int i=0; i<nums.length; i++) {
            nums[i] = input.nextInt();
        }
        int result = arrayPairSum(nums);
        System.out.println("total array pair sum:::"+ result);
    }
        public static int arrayPairSum(int[] nums) {
            int sum = 0;
            Arrays.sort(nums);
            for(int i =0; i<nums.length; i+=2) {
                sum = sum + nums[i];
            }
            return sum;
        }
    }

