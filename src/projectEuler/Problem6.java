package projectEuler;

/**
 * The sum of the squares of the first ten natural numbers is:
 * 12 + 22 + ... + 102 = 385
 *
 * The square of the sum of the first ten natural numbers is:
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural 
 * numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one 
 * hundred natural numbers and the square of the sum.
 *
 * @author markroper
 *
 */
public class Problem6 {
    public static void main(String[] args) {
        long limit = 100L;
        
        //Brute force solution
        System.out.println("Sum of squares minus square of sums for 1-" + limit + " via brute force: " 
                + (squareOfSumsBruteForce(limit) - sumOfSquaresBruteForce(limit)));
        
        //Formula based sum and sum of squares solution, much faster ;)
        long sum = limit * (limit + 1)/2;
        long sumSquares = (2* limit + 1) * (limit + 1) * limit / 6;
        System.out.println("Sum of squares minus square of sums for 1-" + limit + ": " 
                + ((sum * sum) - sumSquares));
        
    }
    
    private static long sumOfSquaresBruteForce(long max) {
        long sumOfSquares = 0L;
        for(long i = 1; i <= max; i++) {
            sumOfSquares += (i * i);
        }
        return sumOfSquares;
    }
    
    private static long squareOfSumsBruteForce(long max) {
        long squareOfSums = 0L;
        for(long i = 1; i <= max; i++) {
            squareOfSums += i;
        }
        return squareOfSums * squareOfSums;
    }
}
