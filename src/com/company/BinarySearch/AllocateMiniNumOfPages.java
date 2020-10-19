package com.company.BinarySearch;

import java.util.Scanner;

public class AllocateMiniNumOfPages {

    public void minimumPages(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[] = new int[n];
        int overallSum = 0, lastMEleSum = 0, low=0, high=n-1, mid=(low+high)/2, count=n-mid-1, max=10000000;
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
            overallSum += arr[i];
            if(n-i-1<count)
                lastMEleSum += arr[i];
        }
        while((n-mid)>=m || (m-mid-1)==0){
            int tillMidSum = overallSum - lastMEleSum;
            if(tillMidSum<lastMEleSum){
//              max = overallSum < lastMEleSum ? overallSum : lastMEleSum;
              if((mid>=(n/2) && n%2!=0 && tillMidSum<lastMEleSum) || (mid<=(n/2) && n%2==0 && ((n-1)-mid-1)==mid && tillMidSum<lastMEleSum))
                  max = tillMidSum;
              else if(mid<=(n/2) && n%2==0 && ((n-1)-mid-1)!=mid && tillMidSum<lastMEleSum)
                  max = overallSum;
              low = mid+1;
            } else
                high=mid-1;
            overallSum = tillMidSum + arr[mid+1];
            lastMEleSum = lastMEleSum - arr[mid+1];
            mid = (low+high)/2;
        }
        System.out.println(max);
    }

}
