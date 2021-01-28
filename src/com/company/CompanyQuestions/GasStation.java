package com.company.CompanyQuestions;

/*
    Source : Interview Bit
    Asked in : Bloomberg, Google, DE Shaw, Amazon, Flipkart
    Link : https://www.interviewbit.com/problems/gas-station/
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GasStation {

    public void gasStationProblem(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i=0; i<N; i++)
            A[i] = scanner.nextInt();
        for(int i=0; i<N; i++)
            B[i] = scanner.nextInt();
        int index = minimumIndex(A, B, N);
        System.out.println(index);
    }

    private int minimumIndex(int A[], int B[], int N){
        int currentPetrol = 0, start=0, prevPet = 0;
        for(int i=0; i<N; i++){
            currentPetrol += (A[i] - B[i]);
            if(currentPetrol<0){
                start = i+1;
                prevPet += currentPetrol;
                currentPetrol=0;
            }
        }
        return (currentPetrol+prevPet)>=0 ? start+1 : -1;
    }

}
