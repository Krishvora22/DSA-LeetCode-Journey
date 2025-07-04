# Partition Labels

> **Difficulty**  
> 🟨 Medium

---

You are given a string `s`.  
We want to partition the string into as many parts as possible so that **each letter appears in at most one part**.  

After concatenating all the parts in order, the resulting string should be equal to `s`.  
Return a list of integers representing the **size of these parts**.

---

## Example 1:

`Input:`  
`s = "ababcbacadefegdehijhklij"`

`Output:`  
`[9, 7, 8]`

`Explanation:`  
`"ababcbaca"` → characters a, b, and c only appear here  
`"defegde"`   → characters d, e, f only appear here  
`"hijhklij"`  → characters h, i, j, k, l only appear here  
`So each character appears in only one part.`
 character appears in only one part.

---

## Example 2:

**Input:**  
`s = "eccbbbbdec"`

**Output:**  
`[10]`

---

## Constraints

- `1 <= s.length <= 500`
- `s` consists of lowercase English letters only
