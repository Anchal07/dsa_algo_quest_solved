package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FreqOfLimitedArrEle {

    public void freq(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=scanner.nextInt();
        Arrays.stream(arr).sorted();
        for(int i=0; i<n;){
            
        }
    }

}
