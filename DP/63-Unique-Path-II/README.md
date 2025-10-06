<h2><a href="https://leetcode.com/problems/unique-paths-ii/">63. Unique Paths II</a></h2> 
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" /> 
<hr> 

<p>
A robot is located at the top-left corner of a <code>m x n</code> grid (marked 'Start').  
The robot can only move either down or right at any point in time.  
Some cells contain obstacles marked as <code>1</code> and empty spaces as <code>0</code>.  
Return the number of unique paths from the top-left to bottom-right corner, avoiding obstacles.
</p>

<h3>Example 1:</h3> 

<p align="center">
  <img src="https://i.ibb.co/5YnwT1g/6690d0e5-addf-4668-8c04-72f4ed96471e.png" alt="Unique Paths II Example Grid" width="200"/>
</p>

<pre>
Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
Output: 2
Explanation: 
There is one obstacle in the middle of the 3x3 grid above.
There are two ways to reach the bottom-right corner:
1. Right → Right → Down → Down
2. Down → Down → Right → Right
</pre>

<h3>Example 2:</h3>
<pre>
Input: obstacleGrid = [[0,1],[0,0]]
Output: 1
</pre>

<h3>Constraints:</h3> 
<ul>
  <li><code>m == obstacleGrid.length</code></li>
  <li><code>n == obstacleGrid[i].length</code></li>
  <li><code>1 ≤ m, n ≤ 100</code></li>
  <li><code>obstacleGrid[i][j]</code> is <code>0</code> or <code>1</code>.</li>
</ul>
