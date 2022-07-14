import java.util.Scanner;
public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer values of Array: ");
        int arr[] = new int[10];
        for(int k=0; k<arr.length; k++)
            arr[k] = input.nextInt();
        System.out.print("N and its double exist?: ");
        boolean result = checkIfExist(arr);
        System.out.print(result);

    }
    public static boolean checkIfExist(int[] arr) {
        boolean result = true;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if((arr[i] == 2*arr[j]) && i != j) {
                    result = true;
                    return result;
                }
                else
                    result = false;
            }
        }
        return result;
    }
}
