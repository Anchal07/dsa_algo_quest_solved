package com.company.CompanyQuestions;

import java.util.Scanner;

public class MaximumProductSubArray {

    public void product() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = scanner.nextInt();
//        int max = 0, p = A[0];
//        for (int i = 1; i < N; i++) {
//            if (A[i] == 0) {
//                max = max < 0 ? 0 : max;
//                p = 1;
//            } else {
//                if (p < 0 && A[i] >= 0) {
//                    p = i + 1 < N && A[i + 1] < 0 ? p * A[i] : A[i];
//                } else if (p == 0 && A[i] > 0) {
//                    p = A[i];
//                } else {
//                    p = p * A[i];
//                }
//                if (p > max || (p < max && i + 1 < N && A[i + 1] < 0 && max <= 0))
//                    max = p;
//                else if (p < max && i + 1 < N && A[i + 1] >= 0) {
//                    p = 1;
//                }
//            }
//        }
        int maxVal = A[0], minVal = A[0], prod = A[0];
        for(int i=1; i<N; i++){
            if(A[i]<0){
                int temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }
            maxVal = Math.max(A[i], A[i] * maxVal);
            minVal = Math.min(A[i], A[i] * minVal);

            prod = Math.max(maxVal, prod);
        }
        System.out.println(prod);
    }
}
