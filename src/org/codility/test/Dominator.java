package org.codility.test;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

	public static void main(String [] args) {
		int[] A = new int[8];
		A[0] = 3;
		A[1] = 4;
		A[2] =  3;
		A[3] = 2;    
		A[4] = 3;    
		A[5] = -1;		 
		A[6] = 3;
		A[7] = 3;
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int index = -1;
		for(int i=0; i<A.length; i++) {
			if(map.isEmpty() || !map.containsKey(A[i])) {
				map.put(A[i], 1);
			} else {
				int value = map.get(A[i]);
				value = value+1;
				map.put(A[i], value);
				if(value > (A.length/2)) {
					index = i;
					break;
				}
			}
		}
		return index;
	}
}
