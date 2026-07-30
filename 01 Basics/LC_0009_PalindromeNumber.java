
class LC_0009_PalindromeNumber {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        
        int dup = x;
        int reverse = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }

        return reverse == dup;
    }
}