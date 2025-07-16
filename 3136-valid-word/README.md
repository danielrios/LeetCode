# 3136. Valid Word

![][easy-shield]
![][topic1-shield]
<div><p>A word is considered <strong>valid</strong> if:</p>

<ul>
 <li>It contains a <strong>minimum</strong> of 3 characters.</li>
 <li>It contains only digits (0-9), and English letters (uppercase and lowercase).</li>
 <li>It includes <strong>at least</strong> one <strong>vowel</strong>.</li>
 <li>It includes <strong>at least</strong> one <strong>consonant</strong>.</li>
</ul>

<p>You are given a string <code>word</code>.</p>

<p>Return <code>true</code> if <code>word</code> is valid, otherwise, return <code>false</code>.</p>

<p><strong>Notes:</strong></p>

<ul>
 <li><code>'a'</code>, <code>'e'</code>, <code>'i'</code>, <code>'o'</code>, <code>'u'</code>, and their uppercases are <strong>vowels</strong>.</li>
 <li>A <strong>consonant</strong> is an English letter that is not a vowel.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> <span>word = "234Adas"</span>
<strong>Output:</strong> <span>true</span>
<strong>Explanation:</strong> This word satisfies the conditions.
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> <span>word = "b3"</span>
<strong>Output:</strong> <span>false</span>
<strong>Explanation:</strong> The length of this word is fewer than 3, and does not have a vowel.
</pre>

<p><strong>Example 3:</strong></p>

<pre>
<strong>Input:</strong> <span>word = "a3$e"</span>
<strong>Output:</strong> <span>false</span>
<strong>Explanation:</strong> This word contains a <code>'$'</code> character and does not have a consonant.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
 <li><code>1 &lt;= word.length &lt;= 20</code></li>
 <li><code>word</code> consists of English uppercase and lowercase letters, digits, <code>'@'</code>, <code>'#'</code>, and <code>'$'</code>.</li>
</ul>
</div>

<!-- LINK GROUP -->

[easy-shield]: https://img.shields.io/badge/easy-46c6c2

[topic1-shield]: https://img.shields.io/badge/string-777
