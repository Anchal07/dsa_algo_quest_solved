package com.company;

import java.util.HashMap;
import java.util.List;

public class FindDuplicates {

    public int duplicates(List<Integer> numbers){
        int res = 0;
        HashMap<Integer, Integer> c = new HashMap<>();
        numbers.stream().forEach(v->{
            if(c.containsKey(v)){
                c.put(v, c.get(v)+1);
            } else {
                HashMap<Integer, Integer> p = new HashMap<>();
                c.put(v, 1);
            }
        });
        res = (int) c.entrySet().stream().filter(v->v.getValue()>1).count();
        return res;
    }

}
