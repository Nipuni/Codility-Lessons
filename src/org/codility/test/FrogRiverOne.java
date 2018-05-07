package org.codility.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: Nipuni Perera
 *
 */
public class FrogRiverOne {
      public static void main(String[] args) {
    	int[] A = {1,3,1,4,3,3,5,2};
  		int X =5;
  		System.out.println(solution(X, A));
      }

    public static int solution(int X, int[] A) {
    	List<Integer> leaves = Arrays.stream(A).boxed().collect(Collectors.toList());
		int seconds = 0;
		Set<Integer> set = new HashSet<>();
		if(!leaves.contains(X)){
			return -1;
		} else {
			for(int i=0; i< A.length; i++){
				if(set.contains(A[i])){
					continue;
				} else {
					if(A[i]<=X){
						set.add(A[i]);
						seconds =i;
					}
				}
			}
		}
		if(set.size()==X) {
			return seconds;
		} else {
			return -1;
		}
    }
}
