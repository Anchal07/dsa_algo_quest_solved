package com.company.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class SubarrayWith0Sum {

    public void subArray(){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();

        HashMap<Integer, Integer> hashMapSum = new HashMap<>();
        hashMapSum.put(0, arr[0]);

        for(int i=1; i<n; i++){
            int sum = arr[i] + hashMapSum.get(i-1);
            if(hashMapSum.values().contains(sum)){
                System.out.println("i - "+ hashMapSum.entrySet().stream().filter(v->v.getValue().equals(sum)).findFirst().get().getKey()+1+
                        " | j : "+ i);
                break;
            }
            hashMapSum.put(i, sum);
        }
    }

}
