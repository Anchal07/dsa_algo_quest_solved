package com.company.arrays;

import java.util.Scanner;

public class ArraySortedAndRotated {

    public void sortedAndRotatedCheck(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int mid = n/2, oneIndex = mid;
        boolean issorted = arr[0] == 1 ? true : false, isrotated = arr[0] == 1 ? false : true;
        while(arr[mid] != 1 && !issorted){
            if(arr[mid] == 1){
                oneIndex = mid;
            } else if(arr[mid] > 1){
                mid = (n+mid-1)/2;
            } else if(arr[mid] < 1){
                mid = (0+mid)/2;
            }
        }
        if(!issorted){
            for(int i=oneIndex+1; i<n; i++){
                if(arr[i] - arr[i-1] == 1)
                    continue;
                else {
                    issorted = false;
                    break;
                }
            }
            for(int i=1; i<oneIndex; i++){
                if(arr[i] - arr[i-1] == 1)
                    continue;
                else {
                    isrotated = false;
                    break;
                }
            }
        }
        if(isrotated && isrotated)
            System.out.println("yes");
        else
            System.out.println("no");
    }

}
