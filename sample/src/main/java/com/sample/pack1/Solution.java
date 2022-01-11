package com.sample.pack1;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

	 public static List<Integer> countingSort(List<Integer> arr) {
		    // Write your code here
		        int[] newArr = new int[100];
		        
		        int a[] = new int[10];
		        
		        
		        for(int i=0; i<arr.size(); i++){
		            int oldItem = arr.get(i);
		            int count = newArr[oldItem];
		            newArr[oldItem] = count + 1;
		        }
		        ArrayList<String> arr1 = new ArrayList<String>();
		        
		        IntStream.range(0, 1).max().ifPresent(x-> System.out.println(x));
		        arr1.stream().forEach(x-> System.out.println(x));
		        
		        //Collections.revers
//		        int[][] intArray = mainList.stream().map(  u  ->  u.stream().mapToInt(i->i).toArray()  ).toArray(int[][]::new);
		        return Arrays.stream(newArr).boxed().collect(Collectors.toList());
		    }
	    
	    
	}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.countingSort(arr);

//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining(" "))
//            + "\n"
//        );

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
