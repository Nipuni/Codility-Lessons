package org.codility.test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * User: NIpuni Perera
 *
 */
public class MaxProductOfThree {
    public static void main(String[]args) {
        int[] A = {-3, 1, 2, -2, 5, 6};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        List<Integer> intList = IntStream.of(A).boxed().collect(Collectors.toList());
        int max1 = Collections.max(intList);
        //System.out.println(max1);
        intList.remove(intList.indexOf(max1));
        //System.out.println(intList);
        int max2 = Collections.max(intList);
        intList.remove(intList.indexOf(max2));
        //System.out.println(intList);
        int max3 = Collections.max(intList);
        return max1*max2*max3;
    }
}
