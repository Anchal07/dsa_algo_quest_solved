package com.company.arrays;

/*
hacker-earth question
level : easy
TODO
 */

import java.util.*;

public class PairsHavingSimilarElements {
//[1,3,5,7,8,2,5,7]
    public void pairs(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), count = 0;
        List<Integer> linkedList = new LinkedList<>();
        List<String> pairs = new ArrayList<>();
        for(int i =0; i<n; i++){
            linkedList.add(scanner.nextInt());
        }
        for(int i = 0; i < n; i++){
            int e = linkedList.get(i);
            if(linkedList.contains(e+1) && linkedList.indexOf(e+1) > i){
                pairs.add("(".concat(String.valueOf(i)).concat(",").concat(String.valueOf(linkedList.indexOf(e+1))).concat(")"));
            }
            if(linkedList.contains(e-1) && linkedList.indexOf(e-1) > i){
                pairs.add("(".concat(String.valueOf(i)).concat(",").concat(String.valueOf(linkedList.indexOf(e-1))).concat(")"));
            }
        }
        System.out.println("created pairs");
    }

}
