package com.company.arrays;

import java.util.Scanner;

public class Rotation {

    public void rotateRes(){
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t!=0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            int j=0;
            int[] res=new int[n];
            int[] arr=new int[n];
            for (int i=0;i<n;i++)
                arr[i]=scanner.nextInt();
            for(int i=k+1;i<n;i++){
                res[j]=arr[i];
                j++;
            }
            for(int i=0;i<=k;i++){
                res[j]=arr[i];
                j++;
            }
            for(int i=0;i<n;i++)
                System.out.println(res[i]);
        }
    }

}
