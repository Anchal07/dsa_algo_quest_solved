package com.company.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeWithoutExtraSpace {

    public void merge(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i=0; i<n; i++)
            a[i] = scanner.nextInt();
        for(int j=0; j<m; j++)
            b[j] = scanner.nextInt();
        for(int i=0, j=0; i<n && j<m;){
            if(a[i] > b[j]){
                swap(a, b, i, j);
                Arrays.sort(a);
                Arrays.sort(b);
            }
            if(a[i] < b[j]){
                i++;
            } else {
                j++;
            }
        }
    }

    void swap(int a[], int b[], int i, int j){
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }

}
