package com.company.matrix;

import java.util.Scanner;

public class BoundaryTraversal {

    public void traverse(){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int matrix[][] = new int[n][n];

        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                matrix[i][j] = scanner.nextInt();

        String output = " ";

        int i=0, j=0;
        for(j=0; j<n; j++){
            output = output.concat(String.valueOf(matrix[i][j])).concat(" ");
        }
        j = n-1; i += 1;
        while(i<n){
            output = output.concat(String.valueOf(matrix[i][j])).concat(" ");
            i++;
        }
        j = n-2; i = n-1;
        while(j>=0){
            output = output.concat(String.valueOf(matrix[i][j])).concat(" ");
            j--;
        }
        i = n-2; j=0;
        while (i>0){
            output = output.concat(String.valueOf(matrix[i][j])).concat(" ");
            i--;
        }
        System.out.println(output);

    }

}
