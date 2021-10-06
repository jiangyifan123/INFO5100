package Question2_9;

public class Main {
    public static String addStrings(String num1, String num2) {
        if(num1.length() < num2.length())
            return addStrings(num2, num1);
        StringBuilder ans = new StringBuilder();
        int i = num1.length()-1, j = num2.length()-1, add = 0;
        for(; i >= 0; i--, j--){
            add += num1.charAt(i) - '0' + (j >= 0? num2.charAt(j) - '0': 0);
            ans.append(add % 10);
            add /= 10;
        }
        if(add != 0)
            ans.append(add);
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "11", num2 = "123";
        System.out.println(addStrings(num1, num2));
        String num3 = "456", num4 = "77";
        System.out.println(addStrings(num3, num4));
    }
}
