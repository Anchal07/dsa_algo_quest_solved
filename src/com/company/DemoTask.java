package com.company;

public class DemoTask {

    public int solution(int[] A) {
        // write your code in Java SE 8
        qSort(A, 0, A.length-1);
        System.out.println(A);
        int smallestEle = 1;
        for(int i=0; i<A.length; i++){
            if(A[i] == smallestEle)
                smallestEle ++;
        }
//        if(A[A.length-1]-smallestEle == 0)
//            smallestEle++;
        return smallestEle;
    }

    void qSort(int arr[], int l, int h){
        if(l<h){
            int p = partition(arr, l, h);
            qSort(arr, l, p-1);
            qSort(arr, p+1, h);
        }
    }

    int partition(int arr[], int l, int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j=l; j<=h-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, h);
        return i+1;
    }

    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
