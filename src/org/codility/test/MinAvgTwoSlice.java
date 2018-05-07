package org.codility.test;

public class MinAvgTwoSlice {

	public static void main (String [] args) {
		int[] A = new int[7];
		A[0] = 4;
		A[1] = 2;
		A[2] = 2;
		A[3] = 5;
		A[4] = 1;
		A[5] = 5;
		A[6] = 8;
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		int minAvgPos = 0;
		double minAvg = -1;
		
		for(int i=0; i<A.length-2 ; i++) {
			if((A[i]+A[i+1])/2.0 < minAvg  || minAvg==-1) {
				minAvg = (A[i]+A[i+1])/2.0 ;
				minAvgPos = i;
			}
			if((A[i]+A[i+1]+A[i+2])/3.0 < minAvg || minAvg==-1) {
				minAvg = (A[i]+A[i+1]+A[i+2])/3.0 ;
				minAvgPos = i;
			}
		}
		if((A[A.length-2]+A[A.length-1])/2.0 < minAvg  || minAvg==-1) {
			minAvg = (A[A.length-2]+A[A.length-1])/2.0;
			minAvgPos = A.length-2;
		}
		
		return minAvgPos;
	}
}
