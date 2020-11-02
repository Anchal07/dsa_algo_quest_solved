package com.company.matrix;

import java.util.Scanner;

public class SpiralTraversal {

    public void traversal(){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m[][] = new int[n][n];

        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                m[i][j] = scanner.nextInt();

        int i, k=0, l=0;
        while (k<n && l<n){
            for (i = l; i < n; ++i) {
                System.out.print(m[k][i] + " ");
            }
            k++;
            for (i = k; i < n; ++i) {
                System.out.print(m[i][n - 1] + " ");
            }
            n--;
            if (k < n) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(m[n - 1][i] + " ");
                }
                n--;
            }
            if (l < n) {
                for (i = n - 1; i >= k; --i) {
                    System.out.print(m[i][l] + " ");
                }
                l++;
            }
        }
    }

}
