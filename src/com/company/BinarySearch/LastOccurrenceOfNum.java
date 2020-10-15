package com.company.BinarySearch;

import java.util.Scanner;

public class LastOccurrenceOfNum {

    public void lastIndex(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i]=scanner.nextInt();
        int x = scanner.nextInt();
        int low=0, high=n-1, mid=(low+high)/2, index=-1;
        while(low<=high){
            if((arr[mid] == x && mid+1<n && arr[mid+1]==x) || (arr[mid]!=x && arr[mid]<x)){
                low = mid+1;
            }
            if(arr[mid]!=x && arr[mid]>x){
                high = mid-1;
            }
            if((arr[mid]==x && mid+1<n && arr[mid+1]!=x) || (arr[mid]==x && mid+1==n)){
                index=mid;
                break;
            }
            mid = (low+high)/2;
        }
        System.out.println(index);
    }

}
