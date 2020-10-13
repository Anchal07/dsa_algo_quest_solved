package com.company.arrays;

import java.util.Scanner;

public class TrappingRainWater {

    public void waterTrapped(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int trappedWater=0, compEle=arr[0], prevGreatest = 0, compIndex=0;
        for(int i=1; i<n; i++){
            if(arr[i] > compEle && i-compIndex == 1){
                compEle = arr[i];
                prevGreatest = i;
            } else if(arr[i] == 0 || arr[i] == compEle)
                continue;
            else if(arr[i] < compEle){
                trappedWater += (Math.abs(compIndex-i)-1) * arr[i];
                compEle = arr[i];
                compIndex = i;
            } else if(arr[i] > compEle && i-compIndex!=1){
                trappedWater += (Math.abs(i-compIndex)-1) * arr[compIndex];
                if(prevGreatest < compIndex){
                    trappedWater += (Math.abs((i-prevGreatest)-1)) * (arr[i]-arr[prevGreatest]);
                    prevGreatest = i;
                }
                compEle = arr[i];
                compIndex = i;
            }
        }
        System.out.println(trappedWater);
    }

}
