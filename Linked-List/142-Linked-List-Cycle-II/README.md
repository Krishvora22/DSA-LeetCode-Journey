<h2><a href="https://leetcode.com/problems/linked-list-cycle-ii">142. Linked List Cycle II</a></h2> 
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>Given the <code>head</code> of a linked list, return the node where the cycle begins. If there is no cycle, return <code>null</code>.</p>

<p>There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the <code>next</code> pointer. Internally, <strong>pos</strong> is used to denote the index of the node that tail's <code>next</code> pointer is connected to (0-indexed). It is <code>-1</code> if there is no cycle. <strong>Note:</strong> Do not modify the linked list.</p>

<h3>Example 1:</h3>

<img src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png" alt="linked list cycle" width="400"/>

<pre>
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
</pre>

<h3>Example 2:</h3>
<pre>
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
</pre>

<h3>Example 3:</h3>
<pre>
Input: head = [1], pos = -1
Output: no cycle
</pre>

<h3>Constraints:</h3>
<ul>
  <li>The number of the nodes in the list is in the range <code>[0, 10<sup>4</sup>]</code>.</li>
  <li><code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
  <li><code>pos</code> is <code>-1</code> or a valid index in the linked list.</li>
</ul>

<h3>✅ Approach (Floyd’s Tortoise and Hare):</h3>
<ul>
  <li>Use two pointers: slow and fast.</li>
  <li>If they meet, a cycle exists.</li>
  <li>To find the cycle start, reset one pointer to head and move both one step at a time.</li>
  <li>The point where they meet again is the start of the cycle.</li>
</ul>
