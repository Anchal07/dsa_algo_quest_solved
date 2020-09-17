package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestMissingNumber {

    public void smallest(){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scanner.nextInt();
        arr = Arrays.stream(arr).sorted().toArray();
        int left=0, right=n, i=(left+right)/2;
        boolean isPositive=false;
        if(arr[0]>0){
            isPositive=true;
        }
        while (i<n){
            if(arr[i]<0 && (i<n && arr[i+1]<0) && !isPositive){
                i = (i + right)/2;
            }else if(arr[i]>0 && (i<n && arr[i-1]>=0) && !isPositive){
                i = (i + left)/2;
            } else {
                isPositive=true;
                if(arr[i]!=1 && arr[i]!=0 && (i>=0 && arr[i-1]<0)){
                    System.out.println(1);
                    break;
                }
                else {
                    if(i+1<n && arr[i+1] - arr[i] != 1){
                        System.out.println(arr[i]+1);
                        break;
                    } else if(i==n-1){
                        System.out.println(arr[i]+1);
                        break;
                    } else
                        i++;
                }
            }
        }
    }
}
