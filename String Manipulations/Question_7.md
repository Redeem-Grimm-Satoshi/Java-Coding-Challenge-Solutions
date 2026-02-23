# Special Order String (Java)

## Problem Statement
You are given a string consisting only of lowercase English letters (`'a'` to `'z'`).  
Your task is to construct a **new string** using a special character-selection order.

The method to implement:

public String specialOrder(String inputString)

The resulting string must be formed as follows:

1. Start from the **last character** of the original string.
2. Continue selecting characters in **reverse order** until you reach the **middle character**.
3. Then begin again from the **first character** of the string.
4. Continue selecting characters in forward order until just **before the middle character**.

In simple terms:
- Print the **right half in reverse**
- Then print the **left half in normal order**

---

### Example

## Input:
`abcdefg`


Process:
- Reverse from end to middle → `g f e d`
- Forward from start to before middle → `a b c`

## Output:
`gfedabc`


---

## Constraints
- The string contains only lowercase letters `a – z`
- `1 ≤ inputString.length ≤ 100`
- No spaces, digits, or special characters are included

---

## Input & Output

| Input String | Output String |
|-------------|-------------|
| `abcdefg` | `gfedabc` |
| `abcd` | `dcab` |
| `a` | `a` |
| `xyz` | `zyx` |

---

### How the Middle is Determined

The middle index is:
`mid = length / 2`


For example:

| String | Length | Middle Index |
|------|------|------|
| `abcdefg` | 7 | 3 (`d`) |
| `abcd` | 4 | 2 (`c`) |

---

## Java Code

```java

