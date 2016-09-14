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
public class PassingCars {
      public static void main (String [] args) {
          int[] A = {0,1};
          System.out.println(solution(A));
      }

    public static int solution(int[] A) {
        int passingCars = 0;
        for(int index = 0; index < A.length; index++) {
            if(A[index]==0){
                //then car A[index] is moving east
                List<Integer> carsMovingWest = IntStream.of(A).boxed().collect(Collectors.toList());
                carsMovingWest = carsMovingWest.subList(index+1,A.length);
                passingCars = passingCars + Collections.frequency(carsMovingWest,1);
            }
        }
        if(passingCars > 1000000000) {
            return -1;
        }
        return passingCars;
    }
}

