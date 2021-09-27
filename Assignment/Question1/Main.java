package Question1;

import java.util.HashMap;

public class Main {
    public static int solution1(int[] nums){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num: nums){
            int cur = 0;
            if(mp.containsKey(num))
                cur = mp.get(num);
            mp.put(num, cur + 1);
        }
        int ans = 0;
        for(int num: nums){
            if(mp.get(num) == 1){
                ans += num;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(solution1(nums));
    }
}
