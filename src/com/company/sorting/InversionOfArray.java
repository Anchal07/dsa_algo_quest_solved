package com.company.sorting;

import java.util.Scanner;

public class InversionOfArray {

    public void inversion(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int count=0;
        mergeSort(arr, 0, n, count);
        System.out.println(count);
    }

    void mergeSort(int arr[], int l, int h, int count){
        if(h>l){
            int m = (l + (h-1))/2;
            mergeSort(arr, l, m, count);
            mergeSort(arr, m+1, h, count);
            merge(arr, l, m, h, count);
        }
    }

    void merge(int arr[], int l, int m, int r, int count){
        int n1 = m-l+1, n2 = r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0; i<n1; i++)
            left[i] = arr[l+i];
        for(int i=0; i<n2; i++)
            right[i] = arr[m+i+1];
        if(n1==1 && n2==1 && left[n1]>right[n2]){
            count = count + 2;
        }
    }

}
