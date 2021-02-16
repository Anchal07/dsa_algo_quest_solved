package com.company.DP;

public class BinomialCoefficient {

    public int nCr(int n, int r){
        int t[][] = new int[n+1][r+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<r+1; j++){
                if(j==i || j==0)
                    t[i][j] = 1;
                else if(j>i)
                    t[i][j] = 0;
                else
                    t[i][j] = t[i-1][j-1] + t[i-1][j];
            }
        }
        return t[n][r];
    }
}
