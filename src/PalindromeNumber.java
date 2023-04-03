import java.util.Arrays;

@SuppressWarnings("UnusedReturnValue")
public class PalindromeNumber {
    public static void main(String[] args) {
        new PalindromeNumber().isPalindrome(112);
    }
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String rs = new StringBuilder(s).reverse().toString();
        boolean res = s.contentEquals(rs);
        System.out.println(s + " " + rs + " " + res);
        return res;
    }
}
