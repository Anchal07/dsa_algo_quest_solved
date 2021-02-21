package com.company.Recursion;

public class SwiggyRecursion {

    public int sequences(){
        int start=1, end=4;
        String sequence = "rrlrl";
        int noOfRights = 0, noOfLefts = 0, sequences = 0;
        for(int i=0; i<sequence.length(); i++){
            if(sequence.charAt(i)=='r')
                noOfRights++;
            else
                noOfLefts++;
        }
        sequences = sequencesFind(start, end, noOfRights, noOfLefts, "");
        System.out.println(sequences);
        return sequences;
    }

    private int sequencesFind(int start, int end, int rights, int lefts, String seq){
        if(start==end){
            System.out.println(seq);
            return 1;
        }
        if((start!=end && (lefts==0 || rights==0)) || start==0){
            return 0;
        }
        int ifRight = sequencesFind(start+1, end, rights-1, lefts, seq+"r");
        int ifLeft = sequencesFind(start-1, end, rights, lefts-1, seq+"l");
        return ifRight+ifLeft;
    }

}
