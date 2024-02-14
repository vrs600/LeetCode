public class Palindrome {

    public static void main(String[] args) {
        int input = 121;
        System.out.println("Is palindrome : " + isPalindrome(input));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int tmp = x;
        int reverse = 0, remainder;

        while (x != 0) {
            remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
            System.out.println(reverse);
        }
        System.out.println("Original No. : " + tmp);
        System.out.println("Reverse No. : " + reverse);
        return reverse == tmp;
    }
}
