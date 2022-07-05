import java.util.Scanner;
public class DuplicateZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers in an array: ");
        int arr[] = new int[10];
        for(int h=0; h<arr.length; h++)
            arr[h] = input.nextInt();
        System.out.print("duplicate zero adding next to the zeros :");
        duplicateZeros(arr);
    }
    public static void duplicateZeros(int[] arr) {
        int t=0;
        int nums[] = new int[arr.length];
        for(int i=0; t<arr.length; i++) {
            if (arr[i] != 0) {
                nums[t] = arr[i];
                t++;
            }
            else {
                nums[t] = arr[i];
                t++;
                if(t<arr.length){
                    nums[t] = 0;
                    t++;
                }
            }

        }
        for(int j=0; j<arr.length; j++) {
            arr[j] = nums[j];
            System.out.print(arr[j]);
        }
    }
}

