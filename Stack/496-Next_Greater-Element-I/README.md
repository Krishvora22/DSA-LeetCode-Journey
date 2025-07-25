<h2><a href="https://leetcode.com/problems/next-greater-element-i">496. Next Greater Element I</a></h2> 
<img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen" alt="Difficulty: Easy" />
<hr>

<p>The <strong>next greater element</strong> of some element <code>x</code> in an array is the first greater element to the right of <code>x</code> in the same array.</p>

<p>You are given two <strong>distinct</strong> 0-indexed integer arrays <code>nums1</code> and <code>nums2</code>, where <code>nums1</code> is a subset of <code>nums2</code>.</p>

<p>For each <code>nums1[i]</code>, find the next greater element in <code>nums2</code>. If it does not exist, return -1 for this number.</p>

<h3>Example 1:</h3>

<pre>
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation:
    For 4, no greater element to the right.
    For 1, the next greater is 3.
    For 2, no greater element.
</pre>

<h3>Example 2:</h3>

<pre>
Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
</pre>

<h3>Constraints:</h3>
<ul>
  <li><code>1 &lt;= nums1.length &lt;= nums2.length &lt;= 1000</code></li>
  <li><code>0 &lt;= nums1[i], nums2[i] &lt;= 10<sup>4</sup></code></li>
  <li>All integers in <code>nums1</code> and <code>nums2</code> are unique.</li>
  <li>All the integers of <code>nums1</code> also appear in <code>nums2</code>.</li>
</ul>

