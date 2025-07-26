<h2><a href="https://leetcode.com/problems/maximal-rectangle/">85. Maximal Rectangle</a></h2> 
<img src="https://img.shields.io/badge/Difficulty-Hard-red" alt="Difficulty: Hard" />
<hr>

<p>Given a <code>rows x cols</code> binary matrix filled with <code>0</code>'s and <code>1</code>'s, find the largest rectangle containing only <code>1</code>'s and return its area.</p>

<h3>Example 1:</h3>

<img src="https://assets.leetcode.com/uploads/2020/09/14/maximal.jpg" width="400" />

<pre>
Input: matrix = [["1","0","1","0","0"],
                 ["1","0","1","1","1"],
                 ["1","1","1","1","1"],
                 ["1","0","0","1","0"]]
Output: 6
</pre>

<h3>Example 2:</h3>

<pre>
Input: matrix = [["0"]]
Output: 0
</pre>

<h3>Example 3:</h3>

<pre>
Input: matrix = [["1"]]
Output: 1
</pre>

<h3>Constraints:</h3>
<ul>
  <li><code>rows == matrix.length</code></li>
  <li><code>cols == matrix[i].length</code></li>
  <li><code>1 &lt;= rows, cols &lt;= 200</code></li>
  <li><code>matrix[i][j]</code> is <code>'0'</code> or <code>'1'</code>.</li>
</ul>

<h3>✅ Approach:</h3>
<ul>
  <li>Treat each row of the matrix as the base of a histogram.</li>
  <li>Convert each row to a height array representing consecutive 1's in columns.</li>
  <li>For each row, calculate the largest rectangle area using the histogram approach (similar to Leetcode 84).</li>
</ul>
