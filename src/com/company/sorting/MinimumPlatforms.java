package com.company.sorting;

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
        int platforms=0;
        sortDepartureWise(arrival, departure, 0, m-1);
    }

    void sortDepartureWise(int arr[], int dept[], int l, int h){
        if(l<h){
            int m = l + (h-l)/2;
            sortDepartureWise(arr, dept, l, h);
            sortDepartureWise(arr, dept, l, h);
            sort(arr, dept, l, h, m);
        }
    }

    void sort(int arr[], int dept[], int l, int h, int m){
        int n1 = m-l+1;
        int n2 = h-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0; i<n1; i++)
            left[i] = dept[l+i];
        for(int i=0; i<n2; i++)
            right[i] = dept[m+i+1];
        int k=0;
        for(int i=0, j=0; i<n1 && j<n2; ){
            if(left[i]<right[j]){
                dept[k++] = left[i];
                swap(arr, k, i);
                i++;
            }
            if(left[i]>dept[j]){

            }
        }
    }

    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[i] = temp;
    }

}
