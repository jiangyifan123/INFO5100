package Question3;

import java.util.HashMap;

public class Main {
    public static int solution(int[] arr){
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num: arr){
            int cur = 0;
            if(mp.containsKey(num))
                cur = mp.get(num);
            mp.put(num, cur + 1);
        }
        for(int num: arr){
            if(mp.get(num) == 1){
                return num;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,2,3,5,7};
        System.out.println(solution(arr));
    }
}
