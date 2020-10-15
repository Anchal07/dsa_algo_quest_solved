package com.company.BinarySearch;

import java.util.Scanner;

public class SquareRootOfNum {

    public void sqRoot(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int low=1, high=num, root=-1, mid=(low+high)/2;
        while(low<=high){
            if(mid*mid == num){
                root = mid;
                break;
            }
            if(mid*mid < num){
                low = mid+1;
            }
            if(mid*mid > num){
                high=mid-1;
            }
            mid = (low+high)/2;
        }
        System.out.println(root==-1 ? mid : root);
    }

}
