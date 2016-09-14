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
