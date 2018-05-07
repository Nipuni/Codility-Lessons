package org.codility.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Triangle {

	public static void main (String [] args) {
		int[] A = new int [6];
		A[0] = 0 ; 
		A[1] = 8 ; 
		A[2] = 1;
		A[3] = 1 ;    
		A[4] = 1  ;  
		A[5] = 20;
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		if(A.length<3){
			return 0;
		}
		List<Integer> array1 = Arrays.stream(A).boxed().collect(Collectors.toList());
		array1 = array1.parallelStream().sorted().collect(Collectors.toList());
		for(int i=0; i<array1.size()-2; i++){
			long P = (long)array1.get(i);
			long Q = (long)array1.get(i+1);
			long R = (long)array1.get(i+2);
			if((P<Q+ R) && (Q<P+R) && (R<P+Q)) {
				return 1;
			}
		}
		return 0;
	}
}
