# Date Addition Challenge

This problem requires calculating a future date by adding a specific number of days to a starting date, while accounting for varying month lengths and leap year rules.

---

## Problem Statement

You are given an initial date as a string in the format `YYYY-MM-DD` and an integer `n` representing the number of days to add. Your task is to return the resulting date in the same `YYYY-MM-DD` format.

**Key Considerations:**
*   **Leap Years:** A year is a leap year if it is divisible by 4, except for century years (divisible by 100), which must also be divisible by 400 to be leap years.
*   **Month Lengths:** Different months have different numbers of days (28, 30, or 31), and February becomes 29 days during a leap year.
*   **Formatting:** The month and day must always be two digits (e.g., `07-09` for July 9th).

---

## Constraints

*   **Date Range:** The year `YYYY` ranges from **1900 to 2100**, inclusive.
*   **Input `n`:** The integer ranges from **1 to 50,000**, inclusive.
*   **Format:** The input and output must strictly follow the `YYYY-MM-DD` pattern.

---

## Input and Output


| Input Date | Input `n` | Expected Output |
| :--- | :--- | :--- |
| `1999-01-01` | `365` | `2000-01-01` |
| `2000-02-28` | `1` | `2000-02-29` |
| `2023-12-31` | `1` | `2024-01-01` |

---

## Java Code

```java
