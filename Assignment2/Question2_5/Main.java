package Question2_5;

public class Main {
    public static void moveZeroes(int[] nums) {
        int pos = 0, n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0)
                nums[pos++] = nums[i];
        }
        while(pos < n){
            nums[pos++] = 0;
        }
    }

    public static void printarray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] nums2 = {0};
        moveZeroes(nums);
        moveZeroes(nums2);
        printarray(nums);
        printarray(nums2);
    }
}
