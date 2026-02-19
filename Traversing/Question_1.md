# Reverse Integer (While Loop Only)

## Problem Description
Write a function that accepts a positive integer `n` and returns a new integer formed by reversing the digits of `n`.

You must **not** convert the integer to a string or any other data type.  
Solve the problem **purely with mathematical operations** and a `while` loop.

Leading zeros in the reversed number should be ignored.  
Example: `1230` → `321`.

---

## 📌 Constraints
- 1 ≤ n ≤ 10⁸  
- Input is always a **positive integer**  
- No string conversion allowed  
- Use **mathematical operations only**  
- Use a **while loop**  

---

## Example
**Input:**  
`12345`

**Output:**  
`54321`

---

## Java Solution
```java
public class Solve {

    public static int reverseNum(int n){
        
        int revNum=0;
        while(n>0){
            int digit=n%10;
            revNum=revNum*10+digit;
            n/=10;
            
        }
        return revNum;
    }
    public static void main(String[] args) {
        
        System.out.println(reverseNum(123));
        
    }
}
