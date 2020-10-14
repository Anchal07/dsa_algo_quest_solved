package com.company.BinarySearch;

import java.util.Scanner;

public class FirstOccurenceOfNum {

    public void binarySearchFirstOccNum(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int x = scanner.nextInt(), low=0, high=n-1, mid= (int) Math.floor((low+high)/2), index=-1;
        while(low<=high){
            if(arr[mid] == x && arr[mid -1]!=x){
                index = mid;
                break;
            }
            else if(arr[mid]!=x && arr[mid]<x){
                low=mid+1;
                mid = (int) Math.floor((low + high)/2);
            } else if((arr[mid]!=x && arr[mid]>x) || (arr[mid]==x && arr[mid-1]==x)){
                high=mid-1;
                mid = (int) Math.floor((low+high)/2);
            }
        }
        System.out.println(index);
    }

}
