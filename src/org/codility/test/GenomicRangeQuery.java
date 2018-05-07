package org.codility.test;


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * User: NIpuni Perera
 */
public class GenomicRangeQuery {
    public static void main(String [] args){
        String S = "CCCCCCC";
        int[] P = new int[3];
        P[0] = 2;
        P[1] = 5;
        P[2] = 0;
        int[] Q = new int[3];
        Q[0] = 4;
        Q[1] = 5;
        Q[2] = 6;
        System.out.println(IntStream.of(solution(S,P,Q)).boxed().collect(Collectors.toList()));
    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        char[] characters = S.toCharArray();
        int[] DNAParams = new int[characters.length];
        for(int index =0; index<DNAParams.length; index++) {
            DNAParams[index] = getInteger(characters[index]);
        }
        List<Integer> intList = IntStream.of(DNAParams).boxed().collect(Collectors.toList());
        for(int index = 0; index<P.length; index++) {
            int min,max;
            min = P[index];
            max = Q[index];
            List<Integer> currentList = (intList.subList(min,max+1));
            int currentMin = Collections.min(currentList);
            result[index] = currentMin;
        }
        return result;
    }

    public static int getInteger(char letter) {
        if(letter=='A'){
            return 1;
        } else if(letter=='C') {
            return 2;
        } else if(letter=='G'){
            return 3;
        } else if(letter=='T'){
            return 4;
        }
        return 0;
    }

}
