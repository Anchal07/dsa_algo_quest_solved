package com.company.arrays;

import java.util.Scanner;

public class MiniAdjDiffCirArray {

    public void minDiff(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scanner.nextInt();
        int min=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            int diff = Math.abs(arr[i]-arr[i-1]);
            if(diff<min)
                min=diff;
        }
    }

}
