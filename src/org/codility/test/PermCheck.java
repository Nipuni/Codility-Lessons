package org.codility.test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * User: Nipuni Perera
 *
 */
public class PermCheck {
	public static void main(String [] args) {
		int[] A = new int [4];//{9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
		A[0] = 4;
		A[1] = 1;
		A[2] = 3;
		A[3] = 2;
		System.out.println(solution(A));
	}

    public static int solution(int[] A) {
    	List<Integer> items = Arrays.stream(A).boxed().collect(Collectors.toList());
		OptionalInt max = (Arrays.stream(A)).reduce(Integer::max);
		int Max = max.getAsInt();
	    for(int i =1; i<= Max ; i++) {
	    	if(!items.contains(i)) {
	    		return 0;
	    	} else {
	    		continue;
	    	}
	    }
		return 1;
    }
}
