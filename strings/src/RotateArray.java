public class RotateArray {

    public void rotate(int[] nums, int k) {

        int n= nums.length;
        int t=0;
        int h=1;
        int num[] = new int[n];
        if(k>n)
            k=k%n;
        if(k%2 ==1) {

            for(int j=0; j<=k; j++) {
                num[n-h] = nums[k-t];
                h++;
                t++;
            }

            for(int i=0; i<k; i++) {
                num[i] = nums[k+1+i];
            }

        }

        else {
            for(int j=0; j<=k; j++) {
                num[n-h] = nums[k-t-1];
                h++;
                t++;
            }

            for(int i=0; i<k; i++) {
                num[i] = nums[k+i];
            }



        }

        for(int l=0; l<n; l++) {
            nums[l] = num[l];
        }
    }
}