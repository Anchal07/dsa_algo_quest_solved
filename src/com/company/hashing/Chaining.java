package com.company.hashing;

import java.util.*;

public class Chaining {

    public void hashByChain(){

        Scanner scanner = new Scanner(System.in);

        int hashSize = scanner.nextInt();
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        for(int i=0; i<arrSize; i++)
            arr[i] = scanner.nextInt();

        HashMap<Integer, List<Integer>> chaining = new HashMap<>();

        for(int i=0; i<arrSize; i++){
            int key = arr[i] % hashSize;
            if(chaining.containsKey(key)){
                List<Integer> list = chaining.get(key);
                list.add(arr[i]);
                chaining.put(key, list);
            } else {
                List<Integer> val = new ArrayList<>();
                val.add(arr[i]);
                chaining.put(key, val);
            }
        }
        System.out.println(chaining);
    }

}
