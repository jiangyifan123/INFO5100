package Question5;

public class Main {
    public static boolean check(String example){
        if(example.length() == 0)
            return true;
        int flag = Character.isDigit(example.charAt(0))? 1: 0;
        flag ^= 1;
        for(int i = 1; i < example.length(); i++){
            if((flag==0 && Character.isDigit(example.charAt(i))) || (flag==1 && Character.isLetter(example.charAt(i))))
                return false;
            flag ^= 1;
        }
        return true;
    }
    public static void main(String[] args) {
        String example = "A2bb2d4";
        System.out.println(check(example));
    }
}
