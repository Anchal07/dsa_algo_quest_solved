package com.company;

public class EndOfList {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = 0, i=0;
        while(A[i] != -1){
            len++;
            i = A[i];
        }
        return len+1;
    }

}
