package org.codility.test;
/*
 * Copyright (c) 2016, Denis Weerasiri All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * User: Nipuni Perera
 *
 */
public class BinaryTest {

    public static void main(String []args) {
        System.out.println(solution(15)); //1001
    }

    public static int solution(int A) {
        String binary = Integer.toBinaryString(A);
        int[] digits = Stream.of(binary.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> listOfOnesPositions = getListOfOnesPositions(digits);
        Object[] ones = listOfOnesPositions.toArray();
        List<Integer> gaps = new ArrayList<>();
        for(int index = 0 ;  (index +1 < ones.length); index ++) {
            int gap = (Integer)ones[index+1] - (Integer)ones[index];
            gaps.add(gap);
        }
        return Collections.max(gaps) -1;
    }

    public static List<Integer> getListOfOnesPositions(int[] digits) {
        List<Integer> listOfOnesPositions = new ArrayList<>();
        for(int index =0; index < digits.length; index ++) {
            if(digits[index] ==1) {
                listOfOnesPositions.add(index);
            }
        }
        return listOfOnesPositions;
    }

}
