<h2><a href="https://leetcode.com/problems/maximal-square">221. Maximal Square</a></h2>

 <img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" /> 
 
 <hr> <p>Given an <code>m x n</code> binary matrix <code>matrix</code> filled with <code>'0'</code>s and <code>'1'</code>s, find the largest square containing only <code>'1'</code>s and return its area.</p>
 
  <h3>Example 1:</h3> 
  <img src="https://assets.leetcode.com/uploads/2020/11/26/max1grid.jpg" alt="maximal square example 1" width="300"/> <pre> Input: matrix = [["1","0","1","0","0"], ["1","0","1","1","1"], ["1","1","1","1","1"], ["1","0","0","1","0"]] Output: 4 </pre>
  
   <h3>Example 2:</h3> <img src="https://assets.leetcode.com/uploads/2020/11/26/max2grid.jpg" alt="maximal square example 2" width="200"/> <pre> Input: matrix = [["0","1"], ["1","0"]] Output: 1 </pre> <h3>Example 3:</h3> <pre> Input: matrix = [["0"]] Output: 0 </pre>

  <h3>Constraints:</h3> <ul> 
  <li><code>m == matrix.length</code></li> 
  <li><code>n == matrix[i].length</code></li> 
  <li><code>1 &lt;= m, n &lt;= 300</code></li>
   <li><code>matrix[i][j]</code> is <code>'0'</code> or <code>'1'</code>.</li> 
   </ul>