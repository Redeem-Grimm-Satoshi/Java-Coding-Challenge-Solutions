

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
