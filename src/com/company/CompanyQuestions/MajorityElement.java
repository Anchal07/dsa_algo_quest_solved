package com.company.CompanyQuestions;

/*
    Source : Interview Bit
    Link : https://www.interviewbit.com/problems/majority-element/
    Asked in : Microsoft, Yahoo, Amazon, Google
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MajorityElement {

    public void majorityElement(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
            if(hm.containsKey(A[i]))
                hm.put(A[i], hm.get(A[i])+1);
            else
                hm.put(A[i],1);
        }
        int element = -1;
        int floor = N/2;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue()>floor)
                element = entry.getKey();
        }
        System.out.println(element);
    }

}
