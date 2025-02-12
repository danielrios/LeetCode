# 20. Valid Parentheses

![][easy-shield]
![][topic1-shield]
![][topic2-shield]

<div><p>Given a string <code>s</code> containing just the characters <code>'('</code>, <code>')'</code>, <code>'{'</code>, <code>'}'</code>, <code>'['</code> and <code>']'</code>, determine if the input string is valid.</p>

<p>An input string is valid if:</p>

<ol>
	<li>Open brackets must be closed by the same type of brackets.</li>
	<li>Open brackets must be closed in the correct order.</li>
	<li>Every close bracket has a corresponding open bracket of the same type.</li>
</ol>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<div>
<p><strong>Input:</strong> <span>s = "()"</span></p>

<p><strong>Output:</strong> <span>true</span></p>
</div>

<p><strong>Example 2:</strong></p>

<div>
<p><strong>Input:</strong> <span>s = "()[]{}"</span></p>

<p><strong>Output:</strong> <span>true</span></p>
</div>

<p><strong>Example 3:</strong></p>

<div>
<p><strong>Input:</strong> <span>s = "(]"</span></p>

<p><strong>Output:</strong> <span>false</span></p>
</div>

<p><strong>Example 4:</strong></p>

<div>
<p><strong>Input:</strong> <span>s = "([])"</span></p>

<p><strong>Output:</strong> <span>true</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
	<li><code>s</code> consists of parentheses only <code>'()[]{}'</code>.</li>
</ul>
</div>
<!-- LINK GROUP -->

[easy-shield]: https://img.shields.io/badge/easy-46c6c2

[topic1-shield]: https://img.shields.io/badge/string-777

[topic2-shield]: https://img.shields.io/badge/stack-777
