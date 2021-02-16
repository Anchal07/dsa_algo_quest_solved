package com.company.DP;

/*
Link : https://leetcode.com/problems/coin-change/submissions/
Platform : Leetcode
Level : Medium
 */

public class CoinChangeProblem {

    public int coinChange(int[] S, int n, int m) {
        int[][] t = new int[n+1][m+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(j==0)
                    t[i][j]=1;
                else if(j<0)
                    t[i][j]=0;
                else if(i<=0 && j>=1)
                    t[i][j]=0;
                else if(S[i-1]<=j){
                    t[i][j] = t[i][j-S[i-1]] + t[i-1][j];
                } else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][m];
    }
}

