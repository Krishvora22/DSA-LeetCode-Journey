<h2><a href="https://leetcode.com/problems/unique-paths/">62. Unique Paths</a></h2> 
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" /> 
<hr> 

<p>
A robot is located at the top-left corner of a <code>m x n</code> grid (marked 'Start' in the diagram below).  
The robot can only move either down or right at any point in time.  
The robot is trying to reach the bottom-right corner of the grid (marked 'Finish').  
How many possible unique paths are there?
</p>

<p align="center">
  <img src="https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png" alt="Unique Paths Grid Example" width="300"/>
</p>

<h3>Example 1:</h3> 
<pre>
Input: m = 3, n = 7
Output: 28
</pre>

<h3>Example 2:</h3>
<pre>
Input: m = 3, n = 2
Output: 3
Explanation: 
From the top-left corner, there are a total of 3 paths to reach the bottom-right corner:
1. Right → Down → Down
2. Down → Down → Right
3. Down → Right → Down
</pre>

<h3>Constraints:</h3> 
<ul>
  <li>1 ≤ m, n ≤ 100</li>
  <li>The answer is guaranteed to be less than or equal to 2 × 10⁹.</li>
</ul>
