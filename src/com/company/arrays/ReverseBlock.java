package com.company.arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseBlock {

    public void reverse(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> mv = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++)
            mv.add(scanner.nextInt());
        int loc=k, counter=k, x=0;
        boolean remaining=false;
        for(int i=0; i<n+1;){
            if(i==loc){
                if(counter!=0){
                    res.add(st.pop());
                    counter--;
                } else {
                    counter = k;
                    loc=i+k;
                    if(i == n){
                        break;
                    }
                    if(loc > n){
                        x=i;
                        remaining=true;
                        break;
                    }
                }
            }
            if(i!=loc){
                st.push(mv.get(i));
                i++;
            }
        }
        if(remaining){
            while(x<n){
                res.add(mv.get(x));
                x++;
            }
        }
    }

}
