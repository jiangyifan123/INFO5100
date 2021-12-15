import java.util.HashMap;

public class Final_3 {
    public static int solution(int[] nums, int k){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0, ans = 0;
        mp.put(0, 1);
        for(int num: nums){
            sum += num;
            ans += mp.getOrDefault(sum - k, 0);
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
    public static void Runtest(){
        System.out.println(solution(new int[]{1,1,1}, 2));
        System.out.println(solution(new int[]{1,2,3}, 3));
    }
    public static void main(String[] args) {
        Runtest();
    }
}
