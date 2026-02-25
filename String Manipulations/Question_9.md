# ⏱ Time Period Length in Minutes

---

## 1. Problem Statement
You are given a string representing a time period in the format:

HH:MM:SS - HH:MM:SS

The first time is the **start time** and the second time is the **end time**.

Your task is to calculate **how many minutes pass** from the start time until the end time.

Important clarification:

We are **not measuring duration by seconds**.

Instead, we count how many times the clock reaches a new minute mark:

HH:MM:00

after the start time and up to the end time.

This means:
- Remaining seconds are ignored.
- A minute is counted only when the clock hits the next `:00` second boundary.

Examples:
- `"12:15:00 - 12:16:59"` → 1 minute
- `"12:14:59 - 12:15:00"` → 1 minute

---

## 2. Constraints
- Time format is always valid.
- `HH` ranges from **00 to 23**
- `MM` ranges from **00 to 59**
- `SS` ranges from **00 to 59**
- Start time is always earlier than end time.
- The period will **never cross midnight**.
- Output must be an **integer number of minutes**.
- Seconds should **not** be rounded — they are discarded.

---

## 3. Input and Output

### Input
A single string:
``"HH:MM:SS - HH:MM:SS"``

Example:
``"12:14:59 - 12:15:00"``


### Output
An integer representing how many `HH:MM:00` minute boundaries occur between the start and end time.

Example:



---

## 4. Java Code

```java
