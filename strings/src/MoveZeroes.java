import java.util.Scanner;
public class MoveZeroes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer values: ");
        int[] nums = new int[10];
        for(int h=0; h<nums.length; h++)
            nums[h] = input.nextInt();
        int[] result = moveZeroes(nums);
        System.out.print("Moving zeroes to the end: ");
        for(int l=0; l<nums.length; l++)
        System.out.print(result[l]);

    }
    public static int[] moveZeroes(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for(int j= k; j<nums.length; j++) {
            nums[j]=0;
        }
        return nums;
    }
}

