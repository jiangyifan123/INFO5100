package Question2;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static int[] solution(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        for(int num: solution(nums)){
            System.out.print(num + " ");
        }
    }
}
