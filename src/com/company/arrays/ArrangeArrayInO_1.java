package com.company.arrays;

import java.util.Scanner;

public class ArrangeArrayInO_1 {

    public void arrange(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
        int temp=-1, index=-1, secTem=-1;
        for(int i=0; i<n; i++){
            if(index == arr[i]){
                secTem = temp;
                temp = arr[i];
                arr[i] = secTem;
            } else if(arr[i] == i){
                continue;
            } else {
                temp = arr[i];
                arr[i] = arr[arr[i]];
            }
            index = i;
        }
    }

}
