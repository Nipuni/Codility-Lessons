package org.codility.test;
/*
 * Copyright (c) 2016, Denis Weerasiri All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
