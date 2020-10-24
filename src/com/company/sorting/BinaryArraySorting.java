package com.company.sorting;

import java.util.Scanner;

public class BinaryArraySorting {

    public void sort(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int i=-1;
        for(int j=0; j<=n-1; j++){
            if(arr[j] == 0){
                i++;
                swap(i, j, arr);
            }
        }
    }

    void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
