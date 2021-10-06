package Question2_8;

import java.util.HashMap;

public class Main {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        boolean[] visited = new boolean[130];
        int[] mp = new int[130];
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(mp[s.charAt(i)] == 0){
                if(visited[t.charAt(i)])
                    return false;
                visited[t.charAt(i)] = true;
                mp[s.charAt(i)] = t.charAt(i);
            }
            else if(mp[s.charAt(i)] != t.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s, t));
        s = "foo";
        t = "bar";
        System.out.println(isIsomorphic(s, t));
    }
}
