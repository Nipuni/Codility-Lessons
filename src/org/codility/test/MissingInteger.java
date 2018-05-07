package org.codility.test;

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
