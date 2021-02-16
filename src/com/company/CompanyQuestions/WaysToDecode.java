package com.company.CompanyQuestions;

/*
    Source : Leet Code
    Link : https://leetcode.com/problems/decode-ways/
    Asked in : Amazon, Facebook
    Difficulty : Medium
 */

import java.util.Scanner;

public class WaysToDecode {

    public void ways(){

        Scanner scanner = new Scanner(System.in);
        String encode = scanner.next();

        char[] codes = new char[encode.length()];
        if(encode.length()==1 && codes[0]=='0'){
            System.out.println(0);
        } else if(encode.length()==1){
            System.out.println(1);
        } else if(codes[0] == '0' || (encode.length()>1 && codes[0] == '0'))
            System.out.println(0);

    }

}
