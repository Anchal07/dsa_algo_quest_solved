package com.company.matrix;

import java.util.Scanner;

public class SnakePattern {

    public void pattern(){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int matrix[][] = new int[n][n];

        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                matrix[i][j] = scanner.nextInt();

        String output = "";

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                for(int j=0; j<n; j++)
                    output = output.concat(String.valueOf(matrix[i][j])).concat(" ");
            } else {
                for(int j=n-1; j>=0; j--)
                    output = output.concat(String.valueOf(matrix[i][j])).concat(" ");
            }
        }
        System.out.println(output);

    }

}
