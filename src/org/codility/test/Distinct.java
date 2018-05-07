package org.codility.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * User: NIpuni Perera
 *
 */
public class Distinct {

    public static void main(String [] args) {
        int []A = {1};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        List<Integer> intList = IntStream.of(A).boxed().collect(Collectors.toList());
        Set<Integer>  distinctSet= new HashSet<>(intList);
        return distinctSet.size();
    }
}
