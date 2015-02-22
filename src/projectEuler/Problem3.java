package projectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author markroper
 */
public class Problem3 {
    
    public static void main(String[] args) {
        long inputValue = 600851475143L;
        List<Long> primeFactors = findPrimeFactors(inputValue);
        Collections.sort(primeFactors, Collections.reverseOrder());
        System.out.println("Prime factors: " + primeFactors);
        System.out.println("Max prime is: " + primeFactors.get(0));
    }
    
    /**
     * Identifies whether or not the input number is prime using an
     * implementation of the Sieve of Eratosthenes.
     * 
     * @param input
     * @return true if prime, otherwise false
     */
    private static boolean isPrime(Long input) {
        if(0 == (input % 2)) {
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
     * Finds all prime factors of the provided input value and returns them
     * in an unsorted list. Finds the smallest prime factor of the input value
     * and then recursively calls itself with the result.
     * 
     * @param input
     * @return
     */
    private static List<Long> findPrimeFactors(Long input) {
        List<Long> primeFactors = new ArrayList<>();
        if(isPrime(input)) {
            primeFactors.add(input);
            return primeFactors;
        }
        for(Long i = 3L; i <= input/2; i += 2) {
            if(0 == input % i && isPrime(i)) {
                primeFactors.add(i);
                primeFactors.addAll(findPrimeFactors(input / i));
                return primeFactors;
            }
        }
        return primeFactors;
    }
}
