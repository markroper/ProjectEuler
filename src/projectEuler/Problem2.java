package projectEuler;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four 
 * million, find the sum of the even-valued terms.
 *
 * @author markroper
 */
public class Problem2 {
    public static void main(String[] args) {
        int maxFibonacciValue = 4000000;
        System.out.println(sumEvenFibonaccisToMax(maxFibonacciValue));
    }
    
    public static long sumEvenFibonaccisToMax(int maxValue) {
        int leftVal = 1;
        int rightVal = 1;
        int nextVal = leftVal + rightVal;
        long sumOfEvens = 0;
        while(leftVal + rightVal < maxValue + 1) {
            if(0 == nextVal % 2) {
                System.out.println(nextVal);
                sumOfEvens += nextVal;
            }
            leftVal = rightVal;
            rightVal = nextVal;
            nextVal = rightVal + leftVal;
        }
        return sumOfEvens;
    }
}
