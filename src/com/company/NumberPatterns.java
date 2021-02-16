package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumberPatterns {

    public int pattern(String pattern){
        if(pattern == null || pattern.length()>8 || (!pattern.contains("M") &&
                !pattern.contains("N")) || pattern.length()<1){
            return -1;
        }

        int len = pattern.length();
        if(len==1){
            if(pattern.charAt(0)=='M'){
                return 21;
            } else {
                return 12;
            }
        }
        if(!pattern.contains("N")){
            String o = "";
            while(len!=0){
                o += String.valueOf((len+1));
                len--;
            }
            o += len+1;
            return Integer.parseInt(o);
        } else if(!pattern.contains("M")){
            int j=0;
            String o = "";
            while(j<len){
                o += String.valueOf(j+1);
                j++;
            }
            o += j+1;
            return Integer.parseInt(o);
        }

        Map<Integer, Boolean> track = new HashMap<>();
        track.put(1, false);
        track.put(2, false);
        track.put(3, false);
        track.put(4, false);
        track.put(5, false);
        track.put(6, false);
        track.put(7, false);
        track.put(8, false);
        track.put(9, false);

        int i=0;
        LinkedHashMap<Integer, LinkedHashMap<Character, Integer>> c = new LinkedHashMap<>();
        LinkedHashMap<Character, Integer> countSeq = new LinkedHashMap<>();
        boolean isPrevM = false;
        while(i<len){
            if(pattern.charAt(i) == 'M'){
                if(isPrevM && i!=0){
                    LinkedHashMap<Character, Integer> x = c.get(i-1);
                    x.put('M', x.get('M')+1);
                    c.put(i-1, x);
                } else {
                    LinkedHashMap<Character, Integer> x = new LinkedHashMap<>();
                    x.put('M', 1);
                    c.put(i, x);
                }
                isPrevM = true;
            } else {
                if(!isPrevM){
                    LinkedHashMap<Character, Integer> x = c.get(i-1);
                    x.put('N', x.get('N')+1);
                    c.put(i-1, x);
                } else {
                    LinkedHashMap<Character, Integer> x = new LinkedHashMap<>();
                    x.put('N', 1);
                    c.put(i, x);
                }
                isPrevM = false;
            }
            i++;
        }
        String output = "";
        for(int k=0; k<c.size(); k++){

        }
        return Integer.parseInt(output);    }

}
