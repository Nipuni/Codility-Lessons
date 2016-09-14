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

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * User: Nipuni Perera
 *
 */
public class MissingInteger {
    public static void main(String [] args) {
        int[] A = new int[6];
        A[0] = -2;
        A[1] = 147483647;
        A[2] = 147483643;
        A[3] = 147483641;
        A[4] = 147483643;
        A[5] = 147483647;
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        List<Integer> intList = IntStream.of(A).boxed().collect(Collectors.toList());
        int result = 1;
        for(int index=1; index<=A.length; index++){
              if(intList.contains(index)){
              } else {
                  result = index;
                  break;
              }
        }
        return result;
    }
}
