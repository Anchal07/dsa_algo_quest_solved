package com.company.Recursion;

public class CatalanNumber {

    public int catalan(String output, int o, int c){
        int r = res(output, o, c);
        return r;
    }

    private int res(String output, int o, int c){
        if(o==0 && c==0){
            System.out.println(output);
            return 1;
        }
        if(o==c){
            return catalan(output + "(", o-1, c);
        } else if (o==0 && c !=0){
            return catalan(output + ")", o, c-1);
        } else {
            return catalan(output+"(", o-1, c) + catalan(output+")", o, c-1);
        }
    }

}
