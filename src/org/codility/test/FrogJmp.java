package org.codility.test;

import java.math.BigInteger;

/**
 * User: NIpuni Perera
 *
 */
public class FrogJmp {
    public static void main(String [] args) {
        System.out.println(solution(10,85,30));
    }

    public static int solution(int X, int Y, int D) {
        BigInteger bigY = BigInteger.valueOf(Y);
        BigInteger bigX = BigInteger.valueOf(X);
        BigInteger bigD = BigInteger.valueOf(D);
        BigInteger targetDistance = bigY.subtract(bigX);
        System.out.println(targetDistance);
        BigInteger numberOfJumps = targetDistance.divide(bigD);
        if(targetDistance.compareTo(numberOfJumps.multiply(bigD))==0) {
            return numberOfJumps.intValue();
        }  else {
            return numberOfJumps.intValue() + 1;
        }

    }
}
