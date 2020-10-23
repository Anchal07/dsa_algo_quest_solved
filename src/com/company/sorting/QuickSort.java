package com.company.sorting;

import java.util.Scanner;

public class QuickSort {

    public void sort(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        qSort(arr, 0, n-1);
        System.out.println(arr);

    }

    void qSort(int arr[], int l, int h){
        if(l<h){
            int p = partition(arr, l, h);
            qSort(arr, l, p-1);
            qSort(arr, p+1, h);
        }
    }

    int partition(int arr[], int l, int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j=l; j<=h-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, h);
        return i+1;
    }

    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
