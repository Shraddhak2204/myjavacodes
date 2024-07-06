
public class palindrome {
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "geeks";

        if (isPalindrome(s)) {
            System.out.println("THE GIVEN STRING IS PALINDROME");
        } else {
            System.out.println("THE GIVEN STRING IS NOT PALINDROME");
        }
    }
}
