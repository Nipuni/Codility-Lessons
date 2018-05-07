package org.codility.test;

import java.math.BigInteger;

/**
 * User: Nipuni Perera
 *
 */
public class CountDiv {
      public static void main(String [] args) {
          System.out.println(solution(1,1,11));
      }

    public static int solution(int A, int B, int K) {
        BigInteger bigA = BigInteger.valueOf(A);
        BigInteger bigB = BigInteger.valueOf(B);
        BigInteger bigK = BigInteger.valueOf(K);

        if(bigA.compareTo(bigB)==0) {
            return 0;
        }
        BigInteger result = bigB.divide(bigK);
        if(bigK.compareTo(bigA) == -1) {
            BigInteger gap = bigA.subtract(bigK);
            if(gap.compareTo(BigInteger.ONE) == 0) {
                result = result.subtract(gap);
            }
            else {
                result = result.subtract(gap.divide(bigK));
            }
        }
        return result.intValue();

    }
}
