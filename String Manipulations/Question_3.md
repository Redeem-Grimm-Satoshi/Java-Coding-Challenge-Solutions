# Title Case Word Formatter

## Problem Description
Write a Java function that takes a string of words and returns a new string where each word is formatted so that:
- The **first character is uppercase** (only if it is a letter).
- All **remaining characters are lowercase**.
- Words remain in their **original order**.

## 📌 Requirements
- Input contains **1–100 words**.
- Words are separated by **single spaces**.
- Words may contain:
  - Letters (`a–z`, `A–Z`)
  - Digits (`0–9`)
  - Underscore (`_`)
- The string will **not** start or end with a space.
- There will be **no double spaces**.
- If a word starts with a **non‑letter** (digit or `_`), keep that character unchanged.
- Punctuation attached to words should remain untouched  
  (e.g., `"Hello,"` stays `"Hello,"`).
- You are **not required** to separate punctuation from words.

## Example
**Input:**  
`SoME rAndoM _TeXT`

**Output:**  
`Some Random _text`

## 💡 Approach
1. Split the string into words using whitespace.
2. For each word:
   - Check the first character.
   - If it’s a letter, convert it to uppercase.
   - Convert the rest of the characters to lowercase.
3. Rejoin the processed words with spaces.
4. Return the final string.

## Code (Java)
```java
package com.app;

public class App {
    public String solution(String inputStr) {
        // TODO: implement the function

        String[] words=inputStr.split(" ");
        String[] capWords=new String[words.length];

        for(int i=0; i<words.length; i++){
            String word=words[i];
            if(word.length()>0){
                char firstChar=word.charAt(0);
                StringBuilder sb=new StringBuilder();
                if(Character.isLetter(firstChar)){
                    sb.append(Character.toUpperCase(firstChar));
                    
                }else{
                    sb.append(firstChar);
                }
                
                if(word.length()>1){
                    sb.append(word.substring(1).toLowerCase());
                    
                }
                capWords[i]=sb.toString();
                
            }}
            return String.join(" ",capWords);
        }
            }
        
        
