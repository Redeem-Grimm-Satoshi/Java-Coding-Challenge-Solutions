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
