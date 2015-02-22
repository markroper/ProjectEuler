package projectEuler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * @author markroper
 */
public class Problem5 {
    //Limit the number of iterations
    public static final long MAX_ITERATIONS = 100000000L;
    
    public static void main(String[] args) {
        System.out.println("Smallest value evenly divisible by 1-20: " + smallestValueEvenlyDivisble(1, 20));
    }
    
    private static long smallestValueEvenlyDivisble(int start, int end) {
        boolean allMatch = false;
        long multiple = 1L;
        long current = multiple * end;
        while(!allMatch && multiple < MAX_ITERATIONS) {
            current = multiple * end;
            allMatch = true;
            for(long i = end - 1; i >= start; i--) {
                if(0 != current % i) {
                    allMatch = false;
                    break;
                }
            }
            multiple ++;
        }
        if(MAX_ITERATIONS == multiple) {
            current = -1L;
        }
        return current;
    }
}
