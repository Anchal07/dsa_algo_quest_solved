package com.company.arrays;

import java.util.Scanner;

public class CountNByKOccurrences {

    public void count(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int occurrences = n/k, max=-1;
        int[] aux = new int[n];
        for(int i=0; i<n; i++){
            aux[arr[i]] = aux[arr[i]]+1;
        }
        for(int i=0; i<n; i++){
            if(aux[i]>occurrences){
                max = i;
                break;
            }
        }
        System.out.println(max);
    }

}
