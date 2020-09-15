package com.company.arrays;

import java.util.Scanner;

public class WaveArray {

    public void sort(){
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scanner.nextInt();
        int size = n%2==0 ? n : n-1;
        for(int i=0;i<size;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }

}
