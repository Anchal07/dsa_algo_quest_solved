package com.company.sorting;

import java.util.Scanner;

public class BubbleSortInO_n {

    public void sort(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int i=0, j=0;
        while (i<n){
            if(j<(n-i-1)){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                j++;
            } else {
                j = 0;
                i++;
            }
        }
    }

}
