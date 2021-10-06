package Question2_4;

public class Main {
    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int[] index = {30005, -30005};
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < wordsDict.length; i++){
            if(wordsDict[i].equals(word1)){
                index[0] = i;
                ans = Math.min(ans, Math.abs(index[0] - index[1]));
            }
            else if(wordsDict[i].equals(word2)){
                index[1] = i;
                ans = Math.min(ans, Math.abs(index[0] - index[1]));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding", word2 = "practice";
        System.out.println(shortestDistance(wordsDict, word1, word2));
        word1 = "makes";
        word2 = "practice";
        System.out.println(shortestDistance(wordsDict, word1, word2));
    }
}
