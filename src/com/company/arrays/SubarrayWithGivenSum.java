package com.company.arrays;

import java.util.Scanner;

public class SubarrayWithGivenSum {

    public void indexes(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumMatch = scanner.nextInt(), sumOfAll=0, max=0, second=n-1, first=0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
            sumOfAll += arr[i];
            if(arr[i]>max)
                max = arr[i];
        };
        while(first<=second){
            if(sumMatch == sumOfAll)
                break;
            if(sumOfAll-arr[first] > sumOfAll-arr[second] && sumOfAll-arr[second]>sumMatch){
                sumOfAll = sumOfAll - arr[second];
                second--;
            } else {
                sumOfAll = sumOfAll - arr[first];
                first++;
            }
        }
        System.out.println("first :".concat(String.valueOf(first)).concat(" second :").concat(String.valueOf(second)));
    }

}
