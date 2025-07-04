# 📘 Odd Even Linked List

## 🧾 Problem Statement

Given the `head` of a singly linked list, group all the nodes with **odd indices** together followed by the nodes with **even indices**, and return the reordered list.

- The **first node** is considered **odd**, the second node is **even**, and so on.
- Maintain the **original relative order** of nodes in both the odd and even groups.

---

## 📥 Input Format

- A singly linked list of integers represented by the pointer `head`.

---

## 📤 Output Format

- The head of the reordered linked list.

---

## 📌 Constraints

- Number of nodes: `0 <= n <= 10^4`
- Node values: `-10^6 <= Node.val <= 10^6`

---

## 🕒 Time & Space Complexity

- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)

---

## 🧪 Examples

### ✅ Example 1

**Input:**  
`head = [1, 2, 3, 4, 5]`

**Output:**  
`[1, 3, 5, 2, 4]`

**Explanation:**  
Odd-indexed nodes: 1 → 3 → 5  
Even-indexed nodes: 2 → 4  
Final order: 1 → 3 → 5 → 2 → 4

---

### ✅ Example 2

**Input:**  
`head = [2, 1, 3, 5, 6, 4, 7]`

**Output:**  
`[2, 3, 6, 7, 1, 5, 4]`

---

## 👨‍💻 Java Function Signature

```java
ListNode oddEvenList(ListNode head)
