package com.company.sorting;

import java.util.Scanner;

public class Closet0s1s2s {

    public void sort(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int l=0, h=n-1, mid=0;
        while(mid<=h){
            switch (arr[mid]){
                case 0 : swap(arr, l, mid);
                        mid++;
                        l++;
                        break;
                case 1 : mid++; break;
                case 2 : swap(arr, mid, h); h--; break;
            }
        }
    }

    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
