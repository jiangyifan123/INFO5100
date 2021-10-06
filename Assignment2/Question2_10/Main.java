package Question2_10;

public class Main {
    public static boolean isvalid(char ch){
        return Character.isLetter(ch) || Character.isDigit(ch);
    }
    public static int getasc(char ch){
        return ch >= 'a'? ch - 'a': ch - 'A';
    }
    public static boolean isPalindrome(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            for(;i < j && !isvalid(s.charAt(i)); i++);
            for(;i < j && !isvalid(s.charAt(j)); j--);
            if(i > j || Character.isDigit(s.charAt(i)) != Character.isDigit(s.charAt(j)))
                return false;
            else if(Character.isLetter(s.charAt(i)) && getasc(s.charAt(i)) != getasc(s.charAt(j)))
                return false;
            else if(Character.isDigit(s.charAt(i)) && s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
