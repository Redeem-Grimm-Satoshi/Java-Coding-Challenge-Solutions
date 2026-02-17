package com.app;

public class Solution {
    // TODO: Implement the solution here
    public String solution(String s) {

        String[] words=s.split(" ");
        String[] reverseWords=new String[words.length];
        
        for(int i=0; i<words.length; i++){
            String lastChar=words[i].substring(words[i].length()-1);
            String resChar=words[i].substring(0,words[i].length()-1);
            reverseWords[i]=lastChar+""+resChar;
            
        }
        
        return String.join(" ",reverseWords);
    }
}
