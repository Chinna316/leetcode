//Given an array of integers arr, return true if and only if it is a valid mountain array.
// arr = {0,3,2,1}
// c1 = 0 to 3 = 1;
// c2 = 3 to 2,2 to 1 = 3;
// 4 = c1 + c2 && c1 > 0 && c2 > 1 so result is true

public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,2,1,0};
        System.out.print(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] arr) {
        int maxi =0;
        int c1=0; // count for ascending order upto maximum value in the array
        int c2=1;  // count for descending order from maximum value to array length
        int h =0;  // index of maximum value in the array
        boolean result = false;
        for(int i=0; i<arr.length; i++) {
            if(maxi<arr[i]){
                maxi = arr[i];
                h = i;
            }

        }

        for(int j=0; j<h; j++) {
            if(arr[j]< arr[j+1]) {
                c1++;
            }
        }

        for(int k=h; k<arr.length-1; k++) {
            if(arr[k]>arr[k+1]) {
                c2++;
            }
        }
        if(arr.length== c1+c2 && c1 > 0 && c2 > 1)
            result = true;
        return result;
    }
}
