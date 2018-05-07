package org.codility.test;

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

