package com.company.BinarySearch;

import java.util.Scanner;

public class CountRepeated {

    public void repeated(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int low=0, high=n-1, mid=(low+high)/2, initalMid=mid;
        while(low<=high){
            if(arr[mid]==arr[mid-1] || (mid+1<n && arr[mid]==arr[mid+1])){
                System.out.println(arr[mid]);
                return;
            } else if(mid+1<n && arr[mid]!=arr[mid+1]){
                low=mid+1;
            }
            mid = low==high ? (0+initalMid-1)/2 : (low+high)/2;
        }
    }

}
