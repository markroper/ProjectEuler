package projectEuler;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 
 * @author markroper
 */
public class Problem9 {
    public static void main(String[] args) {
        System.out.println("Product abc where a + b + c = 1000 and a^2 + b^2 = c^2: " + productABC(1000));
    }
    
    /**
     * Returns the product, if such a product a*b*c where:
     *      a + b + c = sumValue 
     *      a^2 + b^2 = c^2
     *      a, b, & c are integers
     * 
     * Note that this could be done without programming: 
     * a= 2mn; b= m^2 -n^2; c= m^2 + n^2;
     * a + b + c = 1000;
     *  
     * 2mn + (m^2 -n^2) + (m^2 + n^2) = 1000;
     * 2mn + 2m^2 = 1000;
     * 2m(m+n) = 1000;
     * m(m+n) = 500;
     *  
     * m>n;  
     * m= 20; n= 5;
     *
     * a= 200; b= 375; c= 425;
     * 
     * @param sumValue the expected sum value of a + b + c
     * @return the product a*b*c or in degenerate cases, -1
     */
    private static long productABC(int sumValue) {
        for(int a = 1; a < sumValue; a++) {
            for(int b = 1; b < sumValue; b++) {
                double c = Math.sqrt((a * a) + (b * b));
                if(sumValue == (c + b + a)) {
                    System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                    return (long)(a * b * c);
                }
            }
        }
        return -1;
    }
}
