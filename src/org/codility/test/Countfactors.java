package org.codility.test;

public class Countfactors {

	public static void main(String[] args) {
		System.out.println(Sol(120));
	}
	
	public static int Sol(int N) {
		int result = 0;
		int i=1;
		while(i*i<N){
			if(N%i==0){
				result +=2;
			}
			i=i+1;
		}
		if(N%(i*i)==0){
			result +=1;
		}
		
		return result;
	}
}
