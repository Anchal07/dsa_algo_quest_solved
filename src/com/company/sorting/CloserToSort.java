package com.company.sorting;

import java.util.Scanner;

public class CloserToSort {

    public void elementPosition(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int index=-1, low=0, high=n-1, mid=(low+high)/2;
        while(low<=high){
            if((mid==0 && arr[mid]>arr[mid+1]) || (mid-1>=0 && mid+1<=n-1 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])){
                swap(arr, mid, mid+1);
            } else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
                swap(arr, mid, mid-1);
            }
            if(arr[mid] == x){
                index = mid+1;
                break;
            } else if(arr[mid]>x){
                high = mid-1;
            } else if(arr[mid]<x){
                low=mid+1;
            }
            mid = (low+high)/2;
        }
        System.out.println(index);
    }

    void swap(int ar[], int i, int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

}
