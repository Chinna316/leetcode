//Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

//arr = [17,18,5,4,6,1]
// [18,18,5,4,6,1]
// [18,6,5,4,6,1]
// [18,6,6,4,6,1]
// [18,6,6,6,1,1]
// [18,6,6,6,1,-1]

public class ElementsReplace {
public static void main(String[] args) {
    int arr[] = {17,18,5,4,6,1};

       int result[] = replaceElements(arr);
    for(int k=0; k<arr.length; k++)
        System.out.print(result[k]);
}

    public static int[] replaceElements(int[] arr) {
        int max =0;
        for(int i =0; i<arr.length-1; i++) {

            for(int j=i+1; j<arr.length; j++) {
                if(max < arr[j])
                    max = arr[j]; // storing max value after comparing
            }
            arr[i] = max; //store max values right next to each indexes
            max = 0; // setting the maximum value to zero
        }
        arr[arr.length-1] = -1; // assigning last index value to -1
        return arr;
    }
}
