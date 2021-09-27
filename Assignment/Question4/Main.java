package Question4;

import java.util.HashMap;

public class Main {
    public static boolean solution(String ransomNote, String magazine){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            int cur = 0;
            if(mp.containsKey(magazine.charAt(i)))
                cur = mp.get(magazine.charAt(i));
            mp.put(magazine.charAt(i), cur + 1);
        }
        for(int i = 0; i < ransomNote.length(); i++){
            int cur = 0;
            if(mp.containsKey(ransomNote.charAt(i)))
                cur = mp.get(ransomNote.charAt(i));
            else
                return false;
            if(cur <= 0)
                return false;
            mp.put(ransomNote.charAt(i), cur - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(solution(ransomNote, magazine));
    }
}
