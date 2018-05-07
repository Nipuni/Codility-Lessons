package org.codility.test;


import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * User: Nipuni Perera
 *
 */
public class PermMissingElem {

    public static void main (String [] args) {
        int [] A = new int[4];
        A[0] = 2;
        A[1] = 3;
        A[2] = 1;
        A[3] = 5;
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        BigInteger correctTotal= BigInteger.valueOf(0);
        for(int i=1; i<=(A.length+1);i++){
            correctTotal = correctTotal.add(BigInteger.valueOf(i));
        }
        System.out.println(correctTotal);
        BigInteger existingSum = BigInteger.valueOf(IntStream.of(A).sum());
        return (correctTotal.subtract(existingSum)).intValue();
    }
}
