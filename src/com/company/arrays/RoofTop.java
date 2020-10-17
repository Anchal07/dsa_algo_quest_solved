package com.company.arrays;

import java.util.Scanner;

public class RoofTop {

    public void steps(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int steps = 0;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1])
                steps++;
            else if(arr[i] == arr[i-1])
                steps=0;
        }
        System.out.println(steps);
    }

}
