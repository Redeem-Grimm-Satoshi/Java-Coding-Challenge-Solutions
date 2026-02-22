# Move Letter Before Each Number

## Problem Statement
You are provided with a string of alphanumeric characters in which each number, regardless of the number of digits, is always followed by at least one alphabetic character before the next number appears. The task requires you to return a transformed version of the string wherein the first alphabetic character following each number is moved to a new position within the string and characters in between are removed.

Specifically, for each number in the original string, identify the next letter that follows it, and then reposition that character to directly precede the number. All spaces and punctuation marks between the number and the letter are removed.

The operation should maintain the sequential order of the numbers and the rest of the text. This task is not solely about dividing a string into substrings but also about modifying them. This will test your expertise in Java string operations and type conversions.

---

## Constraints
- The length of the string `s` ranges from `3` to `10^6` (inclusive)
- The string contains at least one number
- Each number is followed by at least one alphabetic character before another number appears
- The numbers in the string are integers and non-negative
- Characters between the number and the first following letter may include spaces and punctuation

---

## Input & Output

### Input
`"I have 2 apples and 5! oranges and 3 grapefruits."`

## Output
`"I have a2pples and o5ranges and g3rapefruits."`

## Java Code

```Java

public class App {
    public String solution(String input) {
        // TODO: implement your solution here
        
        
        StringBuilder results=new StringBuilder();
        
        
        for(int i=0; i<input.length(); i++){
            
            
            if(!Character.isDigit(input.charAt(i))){
                results.append(input.charAt(i));
                
            }else{
                StringBuilder num=new StringBuilder();
                
                while(i<input.length() && Character.isDigit(input.charAt(i))){
                    num.append(input.charAt(i));
                    i++;
                    
                }
                
                while(i<input.length() && !Character.isAlphabetic((input.charAt(i)))){
                    i++;
                    
                }
                if(i<input.length()){
                    results.append(input.charAt(i));
                    results.append(num);
                    
                    
                }
                
            }
            
            
        }
        
        
        return results.toString();
    }
}
