<h2><a href="https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum">Number of Subarrays with Bounded Maximum</a></h2> 
<img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' />
<hr>
<p>We are given an array of integers <code>nums</code> and two integers <code>left</code> and <code>right</code>. Return the number of contiguous non-empty subarrays such that the <strong>maximum element</strong> in that subarray is between <code>left</code> and <code>right</code> (inclusive).</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,1,4,3], left = 2, right = 3
<strong>Output:</strong> 3

<strong>Explanation:</strong> The subarrays are:
- [2]
- [2,1]
- [3]
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,9,2,5,6], left = 2, right = 8
<strong>Output:</strong> 7
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
  <li><code>0 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
  <li><code>0 &lt;= left &lt;= right &lt;= 10<sup>9</sup></code></li>
</ul>
