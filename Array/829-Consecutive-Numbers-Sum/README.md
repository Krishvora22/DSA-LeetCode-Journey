# 📘 Number of Ways to Write `n` as a Sum of Consecutive Positive Integers


> **Difficulty**  
> 🟥 Hard

## 🧾 Problem Statement

Given an integer `n`, return the number of ways you can write `n` as the **sum of consecutive positive integers**.

## 📥 Input

- A single integer `n` such that `1 <= n <= 10⁹`

## 📤 Output

- An integer representing the number of ways to express `n` as the sum of **two or more** consecutive positive integers.

## 🔍 Examples

### Example 1
`Input: n = 5`
`Output: 2`
`Explanation: 5 = 2 + 3`

### Example 2
`Input: n = 9
Output: 3
Explanation: 9 = 4 + 5 = 2 + 3 + 4`

### Example 3
`Input: n = 15
Output: 4
Explanation: 15 = 1+2+3+4+5 = 4+5+6 = 7+8`

## 💡 Approach
The sum of `k` consecutive numbers starting from `x` is:

  `n = x + (x+1) + ... + (x+k-1)
    = kx + k(k - 1)/2
    = k*(2x + k - 1)/2`



