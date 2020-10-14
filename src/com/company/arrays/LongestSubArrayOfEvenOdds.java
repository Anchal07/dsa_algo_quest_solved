package com.company.arrays;

import java.util.Scanner;

public class LongestSubArrayOfEvenOdds {

    public void longestSubarray(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i]=scanner.nextInt();
        boolean isPrevEvent = arr[0]%2==0 ? true : false;
        int subArrayCount = 1;
        for(int i=1; i<n; i++){
            if(isPrevEvent && arr[i]%2!=0){
                isPrevEvent=false;
                subArrayCount++;
            } else if(!isPrevEvent && arr[i]%2==0){
                isPrevEvent=true;
                subArrayCount++;
            } else {
                subArrayCount = 1;
            }
        }
        System.out.println(subArrayCount);
    }

}
