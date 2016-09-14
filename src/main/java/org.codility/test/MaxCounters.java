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

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * User: Nipuni Perera
 *
 */
public class MaxCounters {
     public static void main(String []args) {
         int[] A = new int[7];
         A[0] = 3;
         A[1] = 4;
         A[2] = 4;
         A[3] = 6;
         A[4] = 1;
         A[5] = 4;
         A[6] = 4;
         System.out.println(IntStream.of(solution(5,A)).boxed().collect(Collectors.toList()));
     }

    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        for (int i = 0; i<N;i++) {
            counters[i] = 0;
        }
        for(int index=0; index<A.length; index ++) {
            if(A[index] <= N) {
                counters[A[index]-1] = increase(counters[A[index]-1], 1);
            } else if(A[index] == N+1) {
                counters = maxCounter(counters);
            }

        }
        return counters;
    }

    public static int[] maxCounter(int[] counters) {
        List<Integer> intList = IntStream.of(counters).boxed().collect(Collectors.toList());
        int max = Collections.max(intList);
        for (int i = 0; i<counters.length;i++) {
            if(counters[i]<max){
                counters[i] = max;
            }
        }
        return counters;
    }

    public static int increase(int i, int increaseByValue) {
         return i +increaseByValue;
    }
}

