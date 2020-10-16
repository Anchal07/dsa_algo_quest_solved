package com.company.BinarySearch;

import java.util.Scanner;

public class PeakElementUsingBS {

    public void peakElement(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int low=0, high=n-1, mid=(low+high)/2, peak=-1;
        while(low<=high){
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                peak=arr[mid];
                break;
            } else if(arr[mid+1]>arr[mid] && arr[mid-1]<arr[mid]){
                low = mid+1;
            } else if(arr[mid-1]>arr[mid] && arr[mid+1]<arr[mid]){
                high = mid-1;
            } else if(arr[mid-1]>arr[mid] && arr[mid+1]>arr[mid]){
                low = mid+1;
            }
            mid = (low+high)/2;
        }
        System.out.println(peak);
    }

}
