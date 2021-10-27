import java.util.HashMap;
import java.util.HashSet;

public class Midterm4 {
    public static String solution(String s){
        String ans = "";
        HashMap<Character, Integer> mp = new HashMap<>();
        int MaxLen = 0, st = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch) && mp.get(ch) >= st){
                int len = i - st;
                if(len > MaxLen){
                    MaxLen = len;
                    ans = s.substring(st, i);
                }
                st = mp.get(ch) + 1;
            }
            mp.put(ch, i);
        }
        int len = s.length() - st;
        if(len > MaxLen){
            ans = s.substring(st);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solution("ab"));
    }
}
