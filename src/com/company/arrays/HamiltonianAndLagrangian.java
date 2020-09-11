package com.company.arrays;

/*
hacker-earth question
level:easy
Submitted
score : 20/20
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HamiltonianAndLagrangian {

    public void leaders(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new LinkedList<>();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int max = arr[n-1];
        list.add(max);
        for(int i=n-2; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        for(Integer i : list){
            System.out.println(i);
        }
    }
}
