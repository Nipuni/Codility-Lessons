package org.codility.test;

/**
 * User: Nipuni Perera
 * TODO: Include the class description here
 */
public class CyclicRotation {
     public static void main(String [] ars) {
         int[] A = {3, 8, 9, 7, 6};
         System.out.println(solution(A, 3));
     }

    public static int[] solution(int[] A, int K) {
    	int[] B = new int[A.length];
		if(K>A.length & A.length>0){
			K = K % A.length;
		}
		for(int i=0; i<A.length; i++) {
			if(i+K < A.length){
				B[i+K] = A[i];
			} else {
				B[i+K -A.length]=A[i];
			}
		}
		return B;
    }
}
