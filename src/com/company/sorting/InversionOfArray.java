package com.company.sorting;

import java.util.Scanner;

public class InversionOfArray {

    int count = 0;

    public void inversion(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        mergeSort(arr, 0, n-1);
        System.out.println(count);
    }

    void mergeSort(int arr[], int l, int h){
        if(h>l){
            int m = (l + (h-1))/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, h);
            merge(arr, l, m, h);
        }
    }

    void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1, n2 = r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0; i<n1; i++)
            left[i] = arr[l+i];
        for(int i=0; i<n2; i++)
            right[i] = arr[m+1+i];
        if(n1==1 && n2==1 && left[0]>right[0]){
            count = count + 2;
            arr[l] = left[0] < right[0] ? left[0] : right[0];
            arr[l+1] = arr[0] == left[0] ? right[0] : left[0];
        } else {
            int initialI = 0, i=0, j=0, k=-1;
            for(i=0, j=0; i<n1 && j<n2; ){
                if(left[i] < right[j]){
                    initialI = i;
                    arr[++k] = left[i];
                    i++;
                } else {
                    arr[++k] = right[j];
                    j++;
                }
                if(j>=initialI)
                    count++;
            }
            if(i<n1){
                while(i<n1){
                    arr[++k] = left[i];
                    i++;
                }
            }
            if(j<n2){
                while(j<n2){
                    arr[++k] = right[j];
                    j++;
                }
            }
        }
    }

}
