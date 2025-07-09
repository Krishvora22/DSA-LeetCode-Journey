<h2><a href="https://leetcode.com/problems/next-greater-element-iii/">Next Greater Element III</a></h2>
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>
<p>Given a positive integer <code>n</code>, find the smallest integer which has exactly the same digits existing in the integer <code>n</code> and is greater in value than <code>n</code>. If no such positive integer exists, return <code>-1</code>.</p>

<p>Note that the returned integer should fit in <code>32-bit</code> signed integer, if not, return <code>-1</code>.</p>

<p>&nbsp;</p>
<h2><a href="https://leetcode.com/problems/sum-of-subsequence-widths">Sum of Subsequence Widths</a></h2> 
<img src='https://img.shields.io/badge/Difficulty-Hard-red' alt='Difficulty: Hard' />
<hr>
<p>The <strong>width</strong> of a sequence is defined as the difference between the maximum and minimum elements in the sequence.</p>

<p>Given an integer array <code>nums</code>, return <em>the sum of the widths of all the subsequences of <code>nums</code></em>. Since the answer may be very large, return it modulo <code>10<sup>9</sup> + 7</code>.</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,1,3]
<strong>Output:</strong> 6

<strong>Explanation:</strong> All the subsequences are:
[1] => width = 0  
[2] => width = 0  
[3] => width = 0  
[1,2] => width = 1  
[1,3] => width = 2  
[2,3] => width = 1  
[1,2,3] => width = 2  

Total sum = 0 + 0 + 0 + 1 + 2 + 1 + 2 = 6
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2]
<strong>Output:</strong> 0
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
  <li><code>1 &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
</ul>

<h3>✅ Approach:</h3>
<ul>
  <li>Sort the array.</li>
  <li>For each element at index <code>i</code>:
    <ul>
      <li>It will be max in <code>2^i</code> subsequences.</li>
      <li>It will be min in <code>2<sup>n - 1 - i</sup></code> subsequences.</li>
    </ul>
  </li>
  <li>So its total contribution = <code>nums[i] * (2^i - 2^(n-1-i))</code></li>
  <li>Sum all contributions modulo 10<sup>9</sup> + 7</li>
</ul>
<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> n = 12
<strong>Output:</strong> 21
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> n = 21
<strong>Output:</strong> -1
</pre>

<p>&nbsp;</p>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= n &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
