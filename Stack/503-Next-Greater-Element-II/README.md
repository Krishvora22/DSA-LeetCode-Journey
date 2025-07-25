<h2><a href="https://leetcode.com/problems/next-greater-element-ii">503. Next Greater Element II</a></h2> 
<img src="https://img.shields.io/badge/Difficulty-Medium-orange" alt="Difficulty: Medium" />
<hr>

<p>Given a circular array <code>nums</code> (i.e., the next element of <code>nums[nums.length - 1]</code> is <code>nums[0]</code>), return the next greater number for every element in <code>nums</code>.</p>

<p>The next greater number of a number <code>x</code> is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.</p>

<h3>Example 1:</h3>

<pre>
Input: nums = [1,2,1]
Output: [2,-1,2]
</pre>

<h3>Example 2:</h3>

<pre>
Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]
</pre>

<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
  <li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>
