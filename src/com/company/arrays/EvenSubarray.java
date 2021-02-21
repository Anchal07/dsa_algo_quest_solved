package com.company.arrays;

import java.util.*;

/*
TODO
* */

public class EvenSubarray {

    public int arrays(){
        int[] arr= new int[]{6, 3, 5, 8};
        int k=2, count=0;
        Set<Integer> set = new HashSet<>();
        int r=0, l=0;
        for(int i=0; i<=k; i++){
            int odd = 0;
            while(r<arr.length){
                if(arr[r]%2!=0)
                    odd++;
                if(odd>k){
                    count++;
                    odd=0;
                    l++;
                } else {
                    r++;
                }
            }
        }
        return count;
    }

}
