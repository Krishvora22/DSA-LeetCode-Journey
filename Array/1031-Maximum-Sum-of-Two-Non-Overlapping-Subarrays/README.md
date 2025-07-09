<h2><a href="https://leetcode.com/problems/maximum-sum-of-two-non-overlapping-subarrays">Maximum Sum of Two Non-Overlapping Subarrays</a></h2> 
<img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' />
<hr>
<p>Given an integer array <code>nums</code> and two integers <code>firstLen</code> and <code>secondLen</code>, return the maximum sum of a subarray of length <code>firstLen</code> and a subarray of length <code>secondLen</code> with no overlap.</p>

<p>The subarrays can appear in any order.</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,6,5,2,2,5,1,9,4], firstLen = 1, secondLen = 2
<strong>Output:</strong> 20

<strong>Explanation:</strong> One choice of subarrays is [9] with length 1 and [6,5] with length 2.
Sum = 9 + 11 = 20
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,8,1,3,2,1,8,9,0], firstLen = 3, secondLen = 2
<strong>Output:</strong> 29
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [2,1,5,6,0,9,5,0,3,8], firstLen = 4, secondLen = 3
<strong>Output:</strong> 31
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= firstLen, secondLen &lt;= 1000</code></li>
  <li><code>2 &lt;= firstLen + secondLen &lt;= nums.length &lt;= 1000</code></li>
  <li><code>0 &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<h3>✅ Approach:</h3>
<ul>
  <li>Use sliding window to find max sum of two subarrays of lengths <code>firstLen</code> and <code>secondLen</code> placed in both orders (first-second and second-first).</li>
  <li>Calculate prefix sums and slide both windows across the array to ensure no overlap.</li>
</ul>