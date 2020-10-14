package com.company.arrays;

import java.util.Scanner;

public class KadanesAlgo {

    public void kadaneImpl(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int max = arr[0], prevSum=arr[0];
        for(int i=1; i<n; i++){
            int sum = arr[i] + prevSum;
            prevSum = sum>arr[i] ? sum : arr[i];
            if(prevSum>max)
                max=prevSum;
        }
        System.out.println(max);
    }

}
