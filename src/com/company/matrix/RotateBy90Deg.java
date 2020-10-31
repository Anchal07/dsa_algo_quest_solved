package com.company.matrix;

import java.util.Scanner;

public class RotateBy90Deg {

    public void rotate(){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int mat[][] = new int[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                mat[i][j] = scanner.nextInt();

        int k = 0;
        for(int i=0; i<n; i++){
            k = i+1;
            while (k<n){
                int temp = mat[i][k];
                mat[i][k] = mat[k][i];
                mat[k][i] = temp;
                k++;
            }
        }

        int low=0, high=n-1;
        while(low<high){
            for(int j=0; j<n; j++){
                int temp = mat[low][j];
                mat[low][j] = mat[high][j];
                mat[high][j] = temp;
            }
            low++;
            high--;
        }
        System.out.println("done");
    }

}
