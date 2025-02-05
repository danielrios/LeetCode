# 1790. Check if One String Swap Can Make Strings Equal
![][easy-shield]
![][topic1-shield]
![][topic2-shield]
![][topic3-shield]
<div><p>You are given two strings <code>s1</code> and <code>s2</code> of equal length. A <strong>string swap</strong> is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.</p>

<p>Return <code>true</code> <em>if it is possible to make both strings equal by performing <strong>at most one string swap </strong>on <strong>exactly one</strong> of the strings. </em>Otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> s1 = "bank", s2 = "kanb"
<strong>Output:</strong> true
<strong>Explanation:</strong> For example, swap the first character with the last character of s2 to make "bank".
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> s1 = "attack", s2 = "defend"
<strong>Output:</strong> false
<strong>Explanation:</strong> It is impossible to make them equal with one string swap.
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> s1 = "kelb", s2 = "kelb"
<strong>Output:</strong> true
<strong>Explanation:</strong> The two strings are already equal, so no string swap operation is required.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s1.length, s2.length &lt;= 100</code></li>
	<li><code>s1.length == s2.length</code></li>
	<li><code>s1</code> and <code>s2</code> consist of only lowercase English letters.</li>
</ul>
</div>

<!-- LINK GROUP -->

[easy-shield]: https://img.shields.io/badge/easy-46c6c2
[topic1-shield]: https://img.shields.io/badge/hash%20table-777
[topic2-shield]: https://img.shields.io/badge/string-777
[topic3-shield]: https://img.shields.io/badge/counting-777