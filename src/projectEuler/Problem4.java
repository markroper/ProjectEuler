package projectEuler;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author markroper
 *
 */
public class Problem4 {
    public static void main(String[] args) {
        Long a = 999L;
        Long b = 999L;
        System.out.println("Largest palindromic product: " + findLargestPalindromicProduct(a, b));
    }
    
    private static Long findLargestPalindromicProduct(Long a, Long b) {
        Long largestPalindrome = 0L;
        while(a > 99) {
            while(b > 99) {
                Long current = b * a;
                if(current > largestPalindrome && isPalindrome(current)) {
                    largestPalindrome = current;
                }
                b--;
            }
            a--;
            b = a;
        }
        return largestPalindrome;
    }
    
    private static boolean isPalindrome(Long input) {
        String inputString = Long.toString(input);
        int left = 0;
        int right = inputString.length() - 1;
        while(left < right) {
            if(inputString.charAt(left) == inputString.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
    
    
}
