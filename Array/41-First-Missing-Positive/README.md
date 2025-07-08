<h2><a href="https://leetcode.com/problems/first-missing-positive">First Missing Positive</a></h2> 
<img src='https://img.shields.io/badge/Difficulty-Hard-red' alt='Difficulty: Hard' />
<hr>
<p>Given an unsorted integer array <code>nums</code>, return the smallest missing positive integer.</p>

<p>You must implement an algorithm that runs in <strong>O(n)</strong> time and uses constant extra space.</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,2,0]
<strong>Output:</strong> 3
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [3,4,-1,1]
<strong>Output:</strong> 2
</pre>

<p><strong class="example">Example 3:</strong></p>
<pre>
<strong>Input:</strong> nums = [7,8,9,11,12]
<strong>Output:</strong> 1
</pre>

<p><strong>Constraints:</strong></p>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
  <li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

<h3>✅ Approach:</h3>
<ul>
  <li>Use cyclic sort technique.</li>
  <li>Try to place each number at index <code>num - 1</code> if it’s in range <code>[1, n]</code>.</li>
  <li>Then scan the array — the first index <code>i</code> where <code>nums[i] != i + 1</code> is the missing positive.</li>
</ul>
