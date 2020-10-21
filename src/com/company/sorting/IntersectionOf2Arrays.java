package com.company.sorting;

import java.util.Scanner;

public class IntersectionOf2Arrays {

    public void intersection(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i=0; i<n; i++)
            a[i] = scanner.nextInt();
        for(int i=0; i<m; i++)
            b[i] = scanner.nextInt();
        for(int i=0, j=0; i<n && j<m;){
            if(a[i] > b[j]){
                j++;
            } else if(a[i] < b[j]){
                i++;
            } else if(a[i] == b[j] && (a[i]!=a[i-1] || b[j]!=b[j-1])){
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
    }

}
