package com.company.arrays;

import java.util.Scanner;

public class EquilibriumPoint {

    public void point(){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }
        int leftCount=0,lsum=0, rsum=0, rightCount=n-1;
        boolean incrementI=false, isFound=false;
        if(n==1){
            System.out.println(1);
        } else {
            for(int i=0;i<n;){
                if(incrementI){
                    rightCount=n-i-1;
                    leftCount=i-1;
                    incrementI=false;
                }
                if(rightCount!=0){
                    rsum+=arr[i+rightCount];
                    rightCount--;
                }
                if(leftCount>=0 && i>0){
                    lsum+=arr[leftCount];
                    leftCount--;
                }
                if(rsum==lsum){
                    isFound=true;
                    System.out.println(i+1);
                    break;
                }
                if((leftCount==-1 || leftCount==0) && rightCount==0){
                    rsum=0;
                    lsum=0;
                    incrementI=true;
                    i++;
                }
            }
            if(!isFound)
                System.out.println(-1);
        }
    }

}
