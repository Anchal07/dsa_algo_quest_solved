package com.company;

public class Compression {

    public String compressed(String msg) {
        StringBuilder stringBuilder = new StringBuilder();
        int len = msg.length();
        stringBuilder.append(msg.charAt(0));
        char prev = msg.charAt(0);
        int count = 0;
        for (int i = 1; i < len; i++) {
            if (msg.charAt(i) == prev) {
                count++;
            } else {
                if (count != 0) {
                    stringBuilder.append(count + 1);
                }
                stringBuilder.append(msg.charAt(i));
                count = 0;
            }
            prev = msg.charAt(i);
        }
        if(count!=0)
            stringBuilder.append(count+1);
        return stringBuilder.toString();
    }
}