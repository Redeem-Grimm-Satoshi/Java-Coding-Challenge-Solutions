# Parse and Sum Player Scores

## Problem Statement
You are given a string s of length n, with n ranging from 1 to 500 inclusive. This string represents the complex and jumbled record of a sports game. It combines player names and scores but lacks a uniform structure. The player names consist of words made up of lowercase English alphabets (a-z), while the scores are integers ranging from 1 to 100 inclusive. 

Your mission involves writing a Java function public int parseAndSumScores(String s). This function should parse the given string, isolate the integers representing player scores, and return the sum of these scores.

---

## Constraints
- The length of the string n ranges from 1 to 500 inclusive.
- Player names consist of lowercase English alphabets (a-z).
- Scores are integers ranging from 1 to 100 inclusive.

---

## Input & Output

### Input
For instance, for the input string:

`` "joe scored 5 points, while adam scored 10 points and bob scored 2, with an extra 1 point scored by joe" ``

### Output

``18``

### Explanation
Your function should return the sum 5 + 10 + 2 + 1, which totals 18.

---

## Java Code

```java
package com.app;

import java.util.*;

public class App {
    public int parseAndSumScores(String s) {
        // TODO: implement
        
        //lets split the string using " "
        String[] words=s.split(" ");
        
        //this array stores the isolated integers...
        int[] isolatedNumbers=new int[words.length];
        
        //lets declare a variable to store the sum
        int sum=0;
        
        //lets loop through the splited words and look for intergers ranging from 0-9 ...lets use for-each instead
        for(int i=0; i<words.length; i++){
            
            //lets use regex "[^0-9]","" to deal with commas when spliting
            words[i]=words[i].replaceAll("[^0-9]","");
            
            //using regex \\d+ to scan for integer values, if it matches, store those numbers to our integer array
            if(words[i].matches("\\d+")){
                
                isolatedNumbers[i]=Integer.parseInt(words[i]);
                
                //sum all the elements in the array and pass the value to sum
                sum+=isolatedNumbers[i];
                
                
            }
            
        }
        
        return sum;
    }
}
