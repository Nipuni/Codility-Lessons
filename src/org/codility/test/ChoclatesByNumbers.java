package org.codility.test;

public class ChoclatesByNumbers {

	public static void main(String [] args) {
		System.out.println(Sol(10,4));
	}
	
	public static int Sol(int N, int M){
		return N/calculateGcd(N, M);
	}
	
	public static int calculateGcd(int N, int M){
		if(N%M==0){
			return M;
		} else {
			return calculateGcd(M,N%M);
		}
	}
}
