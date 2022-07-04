import java.util.Scanner;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sequence of numbers: ");
        int[] nums = new int[10];
        for(int j =0; j<nums.length; j++ )
            nums[j] = input.nextInt();
        int result = findMaxConsecutiveOnes(nums);
        System.out.print("Max consecutive ones are: " + result);

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int j=0;
        int maxi =0;

        for(int i =0; i<nums.length; i++) {


            while(i<nums.length && nums[i]==1 ) {
                c++;
                i++;
            }
            maxi = Math.max(maxi,c);
            c=0;


        }


        return maxi;
    }
}

