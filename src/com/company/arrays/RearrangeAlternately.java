package com.company.arrays;

import java.util.Scanner;

public class RearrangeAlternately {

    public void arrange() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scanner.nextInt();
        boolean isFirst=true;
        int left = n/2-1, right = n%2==0 ? n/2 : n/2+1, rotation = 0, tempLeft = 0, i=n/2;
        while(i!=0){
            if(isFirst){
                swap(arr, left, right);
                left--;
                right++;
                i--;
                isFirst = false;
            } else {
                if(rotation==0){
                    rotation = right - left;
                    tempLeft = left;
                }
                if(rotation!=0){
                    swap(arr, left++, right);
                    rotation--;
                }
                if(rotation==0){
                    i--;
                    left = tempLeft-1;
                    right++;
                }
            }
            if(i==0 && n%2!=0)
                swap(arr, n-1, n-2);
        }
    }

    private void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}