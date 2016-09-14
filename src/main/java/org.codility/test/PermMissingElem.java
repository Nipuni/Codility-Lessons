package main.java.org.codility.test;
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