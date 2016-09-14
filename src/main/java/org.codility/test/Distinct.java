package main.java.org.codility.test;
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

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * User: NIpuni Perera
 *
 */
public class Distinct {

    public static void main(String [] args) {
        int []A = {1};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        List<Integer> intList = IntStream.of(A).boxed().collect(Collectors.toList());
        Set<Integer>  distinctSet= new HashSet<>(intList);
        return distinctSet.size();
    }
}
