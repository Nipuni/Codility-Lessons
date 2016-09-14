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

/**
 * User: Nipuni Perera
 * TODO: Include the class description here
 */
public class CyclicRotation {
     public static void main(String [] ars) {
         int[] A = {3, 8, 9, 7, 6};
         System.out.println(solution(A, 3));
     }

    public static int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        for(int index = 0; index<A.length;index++) {
            if(index+K<A.length){

                result[index+K]=A[index];
            }
            else {

                result[Math.abs((index + K) - A.length)] =A[index];
            }
        }
        return result;
    }
}
