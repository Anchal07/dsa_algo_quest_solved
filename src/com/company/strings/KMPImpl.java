package com.company.strings;

import java.util.Scanner;

public class KMPImpl {

    public void substring(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String pattern = scanner.next();
        int[] suffix = new int[pattern.length()];
        suffix[0] = 0;
        for(int i=1, j=0; i<suffix.length; ){
            if(pattern.charAt(i) == pattern.charAt(j)){
                suffix[i] = j+1;
                j++;
                i++;
            } else {
                j = j==0 ? 0 : suffix[j-1];
                if(pattern.charAt(j) != pattern.charAt(i) && j!=0){
                    suffix[j]=0;
                }
                if(pattern.charAt(j)==pattern.charAt(i)){
                    suffix[i]=j+1;
                    i++;
                } else if(j==0){
                    suffix[j]=0;
                    i++;
                }
            }
        }
        int index=0;
        boolean mismatch=false;
        for(int i=0,j=0; i<text.length(); i++){
            if(text.charAt(i)==pattern.charAt(j)){
                j++;
            } else if(text.charAt(i) != pattern.charAt(j)){
                mismatch = true;
                j = j-1;
                if(suffix[j] == 0)
                    j = 0;
                else
                    j = suffix[j];
                if(text.charAt(i) == pattern.charAt(j)){
                    index = i - j;
                    j++;
                    mismatch = false;
                }
            }
            if(mismatch){
                index = i+1;
                mismatch = false;
            }
        }
        if(index==0)
            System.out.println(-1);
        else
            System.out.println(index);
    }

}