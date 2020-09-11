package com.company.strings;

import java.util.Scanner;

public class KMPImpl {

    public void substring(){
        Scanner scanner = new Scanner(System.in);
//        String text = scanner.next();
        String pattern = scanner.next();
        int[] suffix = new int[pattern.length()];
        suffix[0] = 0;
        for(int i=1, j=0; i<suffix.length; i++){
            if(pattern.charAt(i) == pattern.charAt(j)){
                suffix[i] = j+1;
                j++;
            } else {
                while (j >= 0){
                    j = j==0 ? 0 : suffix[j-1];
                    if(pattern.charAt(j) == pattern.charAt(i)){
                        suffix[i] = j+1;
                        break;
                    }
                    if (pattern.charAt(j) != pattern.charAt(i) && j!=0) {
                        suffix[j] = 0;
                    }
                    if(j == 0){
                        suffix[i] = 0;
                        break;
                    }
                }
            }
        }
    }

}