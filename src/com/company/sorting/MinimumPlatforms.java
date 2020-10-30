package com.company.sorting;

import jdk.internal.util.xml.impl.Pair;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MinimumPlatforms {

    public void platforms(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arrival[] = new int[n];
        int departure[] = new int[m];
        for(int i=0; i<n; i++)
            arrival[i] = scanner.nextInt();
        for(int i=0; i<n; i++)
            departure[i] = scanner.nextInt();
        int platforms=0, max = 0;
        for(int i=0, j=0; i<n && j<m; ){
            if(arrival[i]<departure[j]){
                platforms++;
                i++;
            } else if(arrival[i] > departure[j]){
                platforms--;
                j++;
            }
            if(platforms > max)
                max = platforms;
        }
        System.out.println(max+1);
    }
}
