package com.company.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfPowerPairs {

    public void pairsCount(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x[] = new int[n];
        int y[] = new int[m];
        for(int i=0; i<n; i++)
            x[i] = scanner.nextInt();
        for(int j=0; j<m; j++)
            y[j] = scanner.nextInt();
        Arrays.sort(x);
        Arrays.sort(y);
        int i=0, low=0, high = n-1, mid=(low+high)/2, originalMid=mid, pairs=0;
        boolean firstJump=true;
        while(low<=high){
            if(x[mid] != y[i] && Math.pow(x[mid], y[i]) > Math.pow(y[i], x[mid])){
                pairs++;
            }
            i++;
            if(i==m){
                i=0;
                if(mid-1<0 && firstJump){
                    low = originalMid+1;
                    firstJump=false;
                    high=n-1;
                } else if(mid-1==0 && mid-1<originalMid){
                    high = mid-1;
                } else{
                    low = mid+1;
                }
            }
            mid = (low + high)/2;
        }
        System.out.println(pairs);
    }

}
