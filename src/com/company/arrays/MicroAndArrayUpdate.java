package com.company.arrays;

/*
hacker-earth question
completely accepted
score : 10/10
level : very-easy
 */

import java.util.Scanner;

public class MicroAndArrayUpdate {

    public void minimumTime(){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        while(cases != 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int min = 0;
            for(int i = 0; i < n; i++){
                int ele = scanner.nextInt();
                if(i == 0)
                    min = ele;
                else if(ele < min)
                    min = ele;
            }
            System.out.println(k < min ? 0 : k - min);
            cases--;
        }
    }

}
