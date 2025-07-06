# LeetCode 1007 - Minimum Domino Rotations For Equal Row

> **Difficulty:** 🟨 Medium  
> **Tag(s):** Greedy, Array

---

## 🧾 Problem Statement

You are given two integer arrays `tops` and `bottoms` of the same length, where `tops[i]` and `bottoms[i]` represent the top and bottom values of the `i-th` domino.

In one rotation, you can swap the top and bottom of any domino.  
Your goal is to make all values in either the **top row** or the **bottom row** equal.

Return the **minimum number of rotations** required to make all values in one row the same.  
If it's not possible, return `-1`.

---

## 📥 Input

- `tops`: integer array of top values
- `bottoms`: integer array of bottom values

---

## 📤 Output

- An integer: the **minimum number of rotations**, or `-1` if not possible

---

## ✅ Constraints

- `2 <= tops.length <= 2 * 10⁴`
- `1 <= tops[i], bottoms[i] <= 6`

---

## 💡 Examples

### Example 1:
Input:
tops = [2, 1, 2, 4, 2, 2]
bottoms = [5, 2, 6, 2, 3, 2]

Output: 2

Explanation:
Rotate dominoes at index 1 and 3 to make all tops = 2:
Final tops: [2, 2, 2, 2, 2, 2]

---

### Example 2:
Input:
tops = [3, 5, 1, 2, 3]
bottoms = [3, 6, 3, 3, 4]

Output: -1

Explanation:
There is no value that exists in all dominos on either top or bottom.

---

## 🧠 Approach

1. Only two numbers are valid candidates: `tops[0]` and `bottoms[0]`.
2. Try each candidate and:
   - Count how many rotations are needed to make all top or bottom values equal.
   - If a value cannot be aligned at any position, discard it.
3. Return the **minimum** of the two rotation counts (top-side or bottom-side).
4. If both fail, return `-1`.

---
