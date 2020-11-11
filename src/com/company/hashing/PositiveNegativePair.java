package com.company.hashing;

import java.util.HashSet;
import java.util.Scanner;

public class PositiveNegativePair {

    public void pair(){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(arr[0]);

        for(int i=1; i<n; i++){
            if(hashSet.contains(Math.abs(arr[i])) || hashSet.contains(-arr[i])){
                System.out.println("-"+ Math.abs(arr[i]) + " and "+ Math.abs(arr[i]));
            } else
                hashSet.add(arr[i]);
        }

    }

}
