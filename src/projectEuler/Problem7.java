package projectEuler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 * @author markroper
 */
public class Problem7 {
    public static void main(String[] args) {
        System.out.println("10,001 th prime " + findNthPrime(10001));
    }
    
    /**
     * Identifies whether or not the input number is prime using an
     * implementation of the Sieve of Eratosthenes.
     * 
     * @param input
     * @return true if prime, otherwise false
     */
    private static boolean isPrime(Long input) {
        if(0 == (input % 2) && input != 2) {
            return false;
        }
        for(Long i = 3L; i*i <= input; i += 2L) {
            if(0 == (input % i)) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Returns the nth prime (ascending order), where 2 is the first prime.
     * @param n
     * @return
     */
    private static long findNthPrime(int n) {
        int primesFound = 0;
        long counter = 1;
        while(primesFound != n) {
            counter++;
            if(isPrime(counter)) {
                primesFound++;
            }
        }
        return counter;
    }
}
