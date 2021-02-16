package com.company;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class NonRepeatingDigit {

    public int nonRepeatingAns(int x, int y, int z){
        int count = 0;
        while(y<=z){
            ArrayList<Character> yCharacters = new ArrayList<>();
            ArrayList<Character> pCharacters = new ArrayList<>();
            String yString = String.valueOf(y);
            int l = yString.length();
            while(l!=0){
                yCharacters.add(yString.charAt(l-1));
                l--;
            }
            String pString = String.valueOf(x * y);
            int p = pString.length();
            while(p!=0){
                pCharacters.add(pString.charAt(p-1));
                p--;
            }
            AtomicBoolean isPresent = new AtomicBoolean(false);
            pCharacters.stream().filter(v-> yCharacters.contains(v))
                    .forEach(v-> isPresent.set(true));
            if(!isPresent.get())
                count++;
            y++;
        }
        return count;
    }

}
