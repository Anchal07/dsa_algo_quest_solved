package com.company.BinarySearch;

import java.util.Scanner;

public class SearchInSortedAndRotatedArray {

    public void search(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int x = scanner.nextInt();
        int low=0, high=n-1, index=-1, mid=(low+high)/2;
        while(low<=high){
            if(arr[mid]==x){
                index=mid;
                break;
            } else if((arr[mid]<x && mid+1<n && arr[mid+1]>=x) || (arr[mid]>x && arr[n-1]>=x && mid+1<n && arr[mid+1]>x) ||
                    (arr[mid]<=x && mid-1>0 && arr[mid-1]>x)){
                low = mid+1;
            } else if((arr[mid]>x && mid-1>0 && arr[mid-1]>=x) || (arr[mid]<x && mid-1>0 && arr[mid-1]>=x)){
                high = mid-1;
            }
            mid = (low+high)/2;
        }
        System.out.println(index);
    }

}
