package org.codility.test;

import java.util.HashSet;

/**
 * User: Nipuni Perera
 *
 */
public class OddOccurancesInArray {
      public static void main (String [] args) {
          int[] A = {3};
          System.out.println(solution(A));
      }

    public static int solution(int[] A) {
    	HashSet<Object> candidates = new HashSet<>();
		for(int i=0; i<A.length; i++){
			int currentValue = A[i];
			if(candidates.contains(currentValue)){
				candidates.remove(currentValue);
			} else {
				candidates.add(currentValue);
			}
		}
		if(candidates.size()>0){
			return (int) candidates.iterator().next();
		} else {
			return 0;
		}
    }
}
