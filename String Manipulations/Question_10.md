# Add Date

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
package com.app;

public class App {

    // Helper data provided (non-leap year default)
    private static final int[] DAYS_IN_MONTH =
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public String addDays(String date, int n) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7)); // 1..12
        int day = Integer.parseInt(date.substring(8, 10));  // 1..31

        while (n > 0) {
            int daysThisMonth = getDaysInMonth(year, month);
            int remainingInMonth = daysThisMonth - day;

            // If we can finish within the current month
            if (n <= remainingInMonth) {
                day += n;
                n = 0;
            } else {
                // Jump to the first day of next month
                n -= (remainingInMonth + 1);
                day = 1;
                month++;
                if (month == 13) {
                    month = 1;
                    year++;
                }
            }
        }

        return String.format("%04d-%02d-%02d", year, month, day);
    }

    private int getDaysInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) return 29;
        return DAYS_IN_MONTH[month - 1];
    }

    private boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}
