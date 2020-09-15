package com.company.arrays;

import java.util.Scanner;

public class RotateArrayByD {

    public void rotate(){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int d=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scanner.nextInt();
        int temp;
        for(int i=0;i<n-d;i++){
            temp=arr[i];
            arr[i] = arr[i+d];
            arr[i+d] = temp;
        }
        int start=n-d, end=n-1;
        while(start<=end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
