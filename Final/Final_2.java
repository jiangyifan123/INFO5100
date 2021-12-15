import java.util.*;

public class Final_2 {
    public static List<List<String>> solution(String[] strs){
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String s: strs){
            char[] cStr = s.toCharArray();
            Arrays.sort(cStr);
            String tmp = String.valueOf(cStr);
            mp.putIfAbsent(tmp, new ArrayList<>());
            mp.get(tmp).add(s);
        }
        for(Map.Entry<String, List<String>> entry : mp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void Runtest(String[] strs){
        System.out.println(solution(strs));
    }
    public static void main(String[] args) {
        Runtest(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Runtest(new String[]{""});
        Runtest(new String[]{"a"});
    }
}
