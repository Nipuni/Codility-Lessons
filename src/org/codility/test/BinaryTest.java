package org.codility.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * User: Nipuni Perera
 *
 */
public class BinaryTest {

    public static void main(String []args) {
        System.out.println(solution(15)); //1001
    }

    public static int solution(int A) {
        String binary = Integer.toBinaryString(A);
        int[] digits = Stream.of(binary.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> listOfOnesPositions = getListOfOnesPositions(digits);
        Object[] ones = listOfOnesPositions.toArray();
        List<Integer> gaps = new ArrayList<>();
        for(int index = 0 ;  (index +1 < ones.length); index ++) {
            int gap = (Integer)ones[index+1] - (Integer)ones[index];
            gaps.add(gap);
        }
        return Collections.max(gaps) -1;
    }

    public static List<Integer> getListOfOnesPositions(int[] digits) {
        List<Integer> listOfOnesPositions = new ArrayList<>();
        for(int index =0; index < digits.length; index ++) {
            if(digits[index] ==1) {
                listOfOnesPositions.add(index);
            }
        }
        return listOfOnesPositions;
    }

}
