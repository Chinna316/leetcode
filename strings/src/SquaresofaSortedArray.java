import java.util.Scanner;
import java.util.Arrays;
public class SquaresofaSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer array: ");
        int nums[] = new int[10];
        for (int j = 0; j < nums.length; j++)
            nums[j] = input.nextInt();
        System.out.print("Squares of a Array: ");
        int result[] = sortedSquares(nums);
        for (int k = 0; k < nums.length; k++)
            System.out.print(result[k] + ",");
    }

    public static int[] sortedSquares(int[] nums) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[t] = nums[i] * nums[i];
            t++;
        }
        Arrays.sort(nums);
        return nums;
    }
}
