import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class midterm3 {
    public static int solution(int[] array){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans = 0;
        for(int num: array){
            if(mp.containsKey(num)){
                if(mp.get(num) == 1)
                    ans += num;
                mp.put(num, 2);
            }
            else
                mp.put(num, 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,-1,3,4,-1}));
    }
}
