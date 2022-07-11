import java.util.ArrayList;
public class DisappearedNumbers {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = findDisappearedNumbers(nums);
            System.out.print(ans);
    }

    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int original[] = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            original[i] = i+1;
        }

        for(int j=0; j<nums.length; j++) {
            original[nums[j] -1] = 0;
        }

        for(int k=0; k<nums.length; k++) {
            if(original[k] != 0)
                result.add(k+1);
        }
        return result;
    }
}
