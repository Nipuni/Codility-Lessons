package org.codility.test;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int[] A = {3,1,2,4,3};
		System.out.println(Solution(A));
	}
	
	public static int Solution(int[] A) {
		int diff = -1;
		int prePart = sum(A, 0,1-1);
	    int postPart = sum(A, 1,A.length-1);
		int temp =  Math.abs( postPart-prePart );
		if(diff<0 || diff>temp) {
			diff = temp;
		}
		for(int i =2; i<A.length; i++ ){
			postPart = postPart-A[i-1];
			prePart = prePart + A[i-1];
			temp = Math.abs(postPart-prePart);
			if(diff<0 || diff>temp) {
				diff = temp;
			}
		}
		return diff;
	}
	
	public static int sum(int[] A, int start, int end) {
		int sum =0;
		for(int j=start; j<=end;j++) {
			sum +=A[j];
		}
		return sum;
	}
}
