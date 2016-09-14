package main.java.org.codility.test;

/**
 * User: Nipuni Perera
 *
 */
public class Test {

    public static void main (String args[]) {
        int A[] = new int[8];
        A[0] = -1 ;
        A[1] =  3 ;
        A[2] = -4  ;
        A[3] =  5   ;
        A[4] =  1    ;
        A[5] = -6     ;
        A[6] =  2      ;
        A[7] =  1       ;
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        int sumOfPrefixes = 0;
        int sumOfsuffixes = 0;

        for(int index = 0 ; index < A.length ; index ++) {
            int equilibrium = A[index];
            for(int prefixIndex = 0 ; prefixIndex < index ; prefixIndex ++) {
                sumOfPrefixes += A[prefixIndex];
            }
            for(int suffixIndex = index + 1 ; suffixIndex < A.length ; suffixIndex ++) {
                sumOfsuffixes += A[suffixIndex];
            }
            System.out.println("sum of suffixes : " + sumOfsuffixes);
            if(sumOfPrefixes == sumOfsuffixes) {
                return index;
            }
            sumOfPrefixes = 0;
            sumOfsuffixes = 0;
        }
        return -1;
    }
}
