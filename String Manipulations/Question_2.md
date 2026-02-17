# Atbash Word Transformer

## Problem Description
Given a string of words separated by whitespace, transform each character into its opposite in the English alphabet (case‑sensitive). 

After transforming all words, reorder the string by placing the **last word first**, followed by the remaining words in their original order.

## 🔤 Opposite Letter Mapping
- a ↔ z  
- b ↔ y  
- c ↔ x  
- ...  
- A ↔ Z  
- B ↔ Y  
- C ↔ X  
- ...

## 📌 Requirements
- Input contains 1–100 words  
- Words contain only letters (a–z, A–Z)  
- No leading/trailing spaces  
- No double spaces  
- Preserve case  
- Apply opposite‑letter mapping  
- Reorder words: last → first  

## Example
**Input:**  
`CapitaL letters`

**Output:**  
`ovggvih XzkrgzO`

## 💡 Approach
1. Split the string into words  
2. Transform each character using the opposite‑alphabet rule  
3. Move the last transformed word to the front  
4. Join the words with spaces  

## Solution (Java)
```java
package com.app;

public class App {
    public String solution(String inputStr) {
        // TODO: implement the string transformation function
        
        //Split the string using " "
        String[] words=inputStr.split(" ");
        
        //arrray to store reversed words
        String[] reverseWords=new String[words.length];
        
        //outerloop
        for(int i=0; i<words.length; i++){
            
            //converting those splitted words to character array so we can manipulate each char efficiently 
            char[] chars=words[i].toCharArray();
            
            //store those transformed words
            StringBuilder transformedWords=new StringBuilder();
            
            //innerloop
            for(int j=0; j<chars.length; j++){
                
                //check if the character is lowercase
                if(Character.isLowerCase(chars[j])){
                    char lowerCaseChar=(char)('z' + 'a' - chars[j]);
                    transformedWords.append(lowerCaseChar);
                //check if the character is uppercase    
                }else if(Character.isUpperCase(chars[j])){
                    char upperCase=(char)('Z' + 'A' - chars[j]);
                    transformedWords.append(upperCase);
                 
                 //if it's not, just let it be   
                }else{
                    transformedWords.append(chars[j]);
                }
                
            }
            
            
            //add character to the reverseWords array
             reverseWords[i]=transformedWords.toString();
            
        }
        
        
        //rebuilding the whole words
        StringBuilder result=new StringBuilder();
        result.append(reverseWords[reverseWords.length-1]);
        for(int i=0; i<reverseWords.length-1; i++){
            result.append(" ").append(reverseWords[i]);
        }
        
        return result.toString();
    
    }
}
