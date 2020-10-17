package com.company.BinarySearch;

import java.util.Scanner;

public class MiniInSortedRotatedArray {

    public void minimum(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int low=0, high=n-1, mid=(low+high)/2, min=-1;
        while(low<=high){
            if(arr[mid+1]>arr[mid])
                low = mid+1;
            if(arr[mid+1]<arr[mid]){
                min = arr[mid+1];
                break;
            }
            mid = (low+high)/2;
        }
        System.out.println(min);
    }

}
