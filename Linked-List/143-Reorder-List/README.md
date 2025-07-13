<h2><a href="https://leetcode.com/problems/reorder-list">143. Reorder List</a></h2> 
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>You are given the head of a singly linked list. Reorder the list in-place as follows:</p>

<p>
L<sub>0</sub> → L<sub>1</sub> → … → L<sub>n-1</sub> → L<sub>n</sub>  
reorders to  
L<sub>0</sub> → L<sub>n</sub> → L<sub>1</sub> → L<sub>n-1</sub> → L<sub>2</sub> → L<sub>n-2</sub> → …
</p>

<p><strong>Note:</strong> You may not modify the values in the list's nodes. Only the node connections can be changed.</p>

<h3>Example 1:</h3>

<img src="https://assets.leetcode.com/uploads/2021/03/04/reorder1linked-list.jpg" alt="Reorder example 1" width="450"/>

<pre>
Input: head = [1,2,3,4]
Output: [1,4,2,3]
</pre>

<h3>Example 2:</h3>

<pre>
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
</pre>

<h3>Constraints:</h3>
<ul>
  <li>The number of nodes in the list is in the range <code>[1, 5 * 10<sup>4</sup>]</code>.</li>
  <li><code>1 &lt;= Node.val &lt;= 1000</code></li>
</ul>
