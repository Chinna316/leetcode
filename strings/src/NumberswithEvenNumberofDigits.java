import java.util.Scanner;
public class NumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer Array: ");
        int[] nums = new int[10];
        for (int j = 0; j < nums.length; j++)
            nums[j] = input.nextInt();
        int result = findNumbers(nums);
        System.out.print("Numbers with even number of digits: " + result);
    }


    public static int findNumbers(int[] nums) {

        int c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int c = 1;
            while (nums[i] / 10 != 0) {

                nums[i] = nums[i] / 10;
                c++;
            }
            if (c % 2 == 0 && c != 1)
                c2++;
        }
        return c2;

    }
}