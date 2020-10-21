package com.company.sorting;

import java.util.Scanner;

public class UnionOf2Arrays {

    public void union(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i=0; i<n; i++)
            a[i] = scanner.nextInt();
        for(int i=0; i<m; i++)
            b[i] = scanner.nextInt();
        int res[] = new int[n+m];
        int i=0, j=0, k=-1;
        for(i=0, j=0; i<n && j<m; ){
            if(a[i] > b[j]){
                res[++k] = b[j];
                j++;
            } else if(a[i] < b[j]){
                res[++k] = a[i];
                i++;
            } else if(a[i] == b[j] && (a[i]!=a[i-1] || b[j]!=b[j-1])){
                res[++k] = a[i];
                i++;
                j++;
            }
        }
        if(i<n){
            for(int o=i; o<n; o++){
                res[++k] = a[o];
            }
        } else if(j<m){
            for(int o=j; o<m; o++)
                res[++k] = b[o];
        }
    }

}
