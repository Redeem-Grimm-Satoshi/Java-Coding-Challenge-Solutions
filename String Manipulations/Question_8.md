# Add Seconds To Times

## Problem Statement
You are given two input arguments:

1. **timePoints** — a list of strings representing times in the format **"HH:MM:SS"**  
   - Each string represents a valid time between **"00:00:00"** and **"23:59:59"** (24-hour clock).

2. **addedSeconds** — an integer representing a number of seconds to add to every time.

Your task is to implement a function:
``addSecondsToTimes(timePoints, addedSeconds)``


The function must return a **new list of strings** where each time has `addedSeconds` added to it.

If the addition exceeds `23:59:59`, the time should **roll over to the next day** (i.e., wrap around to `00:00:00`).

---

## Constraints
- `1 ≤ n ≤ 100` (where *n* is the number of time strings)
- Each time string is valid and formatted as `HH:MM:SS`
- `1 ≤ addedSeconds ≤ 86,400`  
  (86,400 seconds = exactly 24 hours)
- The output must remain in **HH:MM:SS** format
- Leading zeros must be preserved (example: `01:05:09`)

---

## Input & Output

### Example
**Input**

``timePoints = {"10:00:00", "23:30:00"}``
``addedSeconds = 3600``


**Output**
``{"11:00:00", "00:30:00"}``


Explanation:
- `10:00:00 + 3600 seconds (1 hour) = 11:00:00`
- `23:30:00 + 3600 seconds = 24:30:00 → wraps → 00:30:00`

---

## Approach
1. Parse the time string into **hours, minutes, seconds**
2. Convert the entire time into **total seconds**
3. Add `addedSeconds`
4. Use modulo `86400` (seconds in a day) to handle rollover
5. Convert seconds back into hours, minutes, seconds
6. Format using leading zeros

---

## Java Code

```java

