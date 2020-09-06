package com.company.arrays;

/*
Question of hackerearth
Partially submitted
Score : 3.6/10
level : very-easy
 */

public class BracketSequence {

    public int validCombination(String sequence){
        int count = 0, startBracketCount = 0, backBracketCount = 0;
        char[] seqArr = sequence.toCharArray();
        for(int i = 0; i < seqArr.length; i++){
            if(seqArr[i] == ')')
                startBracketCount++;
            if(seqArr[i] == '(' && i+1 < seqArr.length && seqArr[i+1] == ')'){
                i++;
                count++;
            }
            if(seqArr[i] == '(' && i+1<seqArr.length && seqArr[i+1] == '(' && i+2<seqArr.length && seqArr[i+2] == ')' &&
                    i+3<seqArr.length && seqArr[i+3] == ')'){
                count++;
                i = i + 3;
            }
            if(seqArr[i] == '(')
                backBracketCount++;
        }
        if(startBracketCount == backBracketCount && (startBracketCount == 2 || startBracketCount == 0 || startBracketCount == 1)){
            return count + startBracketCount;
        }
        return 0;
    }

}
