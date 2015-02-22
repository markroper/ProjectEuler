package projectEuler;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author markroper
 */
public class Problem1 {
    
    public static void main(String[] args) {
        int maxValueExclusive = 1000;
        System.out.println("Sum: " + sumUniqueValuesOfMultiplesBelowMax(3, 5, maxValueExclusive));
    }
    
    private static long sumUniqueValuesOfMultiplesBelowMax(int a, int b, int max) {
        long sum = 0;
        for(int i = 1; i <= (max - 1) / a; i++) {
            sum += a * i;
        }
        for(int i = 1; i <= (max -1) / b; i++) {
            sum += b * i;
        }
        //Remove duplicates counted twice - faster than doing division repeatedly.
        //Also takes up less space than keeping a hashset of visited values.
        long lcm = leastCommonMultiple(a, b);
        for(int i = 1; i <= (max - 1) / lcm; i++) {
            sum -= i * lcm;
        }
        
        return sum;
    }
    
    private static long greatestCommonDenominator(long a, long b) {
        while (b > 0)
        {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static long leastCommonMultiple(long a, long b) {
        return a * (b / greatestCommonDenominator(a, b));
    }
    
}
