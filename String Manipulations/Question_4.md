

# 1. Problem Statement
You are given a string containing a series of words separated by a hyphen (`-`). Each word can be either a lowercase letter from `'a'` to `'z'` or a number from **1 to 26**. Your task is to swap the type of each word: convert numbers into their corresponding letters (`1 → a`, `2 → b`, … `26 → z`) and convert letters into their numerical equivalents (`a → 1`, `b → 2`, … `z → 26`). Return a new string with the converted words, joined with hyphens, while preserving the original order.


# 2. Constraints
- Input length: **1 to 1000** characters  
- Input is never empty  
- All words are valid lowercase letters or numbers in the range **1–26**  
- Output must maintain the original hyphen structure  

# 3. Example Input and Output
**Input:**  
`1-a-3-c-5`  

**Output:**  
`a-1-c-3-e`

# 4. Code (Java)
```java
package com.app;

import java.util.*;

public class App {

    public String solution(String s) {
        // TODO: Implement the function that could solve the task
        
        //split the string
        String[] words=s.split("-");
        
        //store the splited words so we can manipulate it
        List<String> results=new ArrayList<>();
        
        //loop through the splitedWords and convert it into a char array
        for(String word:words){
            
            //lets check if the word is a letter, if it's true we convert it to a number
            if(word.length()==1 && Character.isLetter(word.charAt(0))){
                
                //convert to number
                int num=word.charAt(0) - 'a' + 1;
                results.add(String.valueOf(num));
              
                
            //check if it matches numbers from 0-9 
            }else if(word.matches("\\d+")){
                
                //convert to character
                char letter=(char)('a' + Integer.parseInt(word)-1);
                results.add(String.valueOf(letter));
                
            }
            
        
                    
        }
        
        
        
        //build and join string using - after each word or number
        return String.join("-",results);
    }
}
