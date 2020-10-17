package com.company.BinarySearch;

import java.util.Scanner;

public class FloorInSortedArray {

    public void floor(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int x = scanner.nextInt();
        int low=0, high=n-1, mid=(low+high)/2, floor=-1;
        while(low <= high){
            if(arr[mid]>x && arr[0]<x && arr[n-1]>x){
                high = mid-1;
            } else if(arr[mid]<x && arr[mid+1]>x){
                floor = arr[mid];
                break;
            } else {
                low = mid+1;
            }
            mid = (low+high)/2;
        }
        System.out.println(floor);
    }

}
