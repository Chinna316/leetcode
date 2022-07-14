import java.util.Arrays;
import java.util.Scanner;
public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer values for nums1: ");
        int nums1[] = new int[10];
        for(int j=0; j<nums1.length; j++) {
            nums1[j] = input.nextInt();
        }

        System.out.print("Enter the value for m: ");
        int m = input.nextInt();


        int nums2[] = new int[5];
        System.out.print("Enter the integer values for nums2: ");
        for(int k=0; k<nums2.length; k++) {
            nums2[k] = input.nextInt();
        }

        System.out.print("Enter the value for n: ");
        int n =input.nextInt();

        merge(nums1, m, nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i =m; i<nums1.length; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
        for(int h=0; h<nums1.length; h++)
        System.out.print(nums1[h]);
    }
}

