package Question2_12;

public class Main {
    public static int compress(char[] chars) {
        int cnt = 0, idx = 0;
        for(int i = 0; i < chars.length; i++){
            cnt++;
            if(i == chars.length-1 || chars[i] != chars[i+1]){
                chars[idx++] = chars[i];
                if(cnt > 1){
                    for(char ch: Integer.toString(cnt).toCharArray())
                        chars[idx++] = ch;
                }
                cnt = 0;
            }
        }
        return idx;
    }

    public static void printans(char[] chars){
        int idx = compress(chars);
        for(int i = 0; i < idx; i++){
            System.out.print(chars[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        printans(new char[]{'a','a','b','b','c','c','c'});
        printans(new char[]{'a'});
    }
}
