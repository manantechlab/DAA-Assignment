<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DAA Assignment - LeetCode Solutions</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, Helvetica, sans-serif;
        }

        body {
            background: #eef3f8;
            color: #333;
        }

        .container {
            width: 90%;
            max-width: 1200px;
            margin: 40px auto;
            background: #fff;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
            overflow: hidden;
        }

        header {
            background: linear-gradient(135deg, #0d6efd, #0b5ed7);
            color: white;
            text-align: center;
            padding: 35px;
        }

        header h1 {
            font-size: 36px;
        }

        header p {
            margin-top: 10px;
            font-size: 18px;
        }

        section {
            padding: 30px;
        }

        h2 {
            color: #0d6efd;
            margin-bottom: 15px;
            border-left: 6px solid #0d6efd;
            padding-left: 10px;
        }

        p {
            margin-bottom: 15px;
            line-height: 1.7;
        }

        ul {
            margin-left: 20px;
            margin-bottom: 20px;
        }

        li {
            margin: 8px 0;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0 40px;
        }

        th {
            background: #0d6efd;
            color: white;
            padding: 14px;
        }

        td {
            padding: 12px;
            border: 1px solid #ddd;
        }

        tr:nth-child(even) {
            background: #f8f9fa;
        }

        tr:hover {
            background: #eaf2ff;
        }

        a {
            color: #0d6efd;
            text-decoration: none;
            font-weight: bold;
        }

        a:hover {
            text-decoration: underline;
        }

        .info {
            background: #f7fbff;
            border-left: 5px solid #0d6efd;
            padding: 20px;
            border-radius: 8px;
            margin-top: 20px;
        }

        footer {
            background: #0d6efd;
            color: white;
            text-align: center;
            padding: 18px;
            font-size: 15px;
        }

        @media(max-width:768px){
            table{
                font-size:14px;
            }

            header h1{
                font-size:28px;
            }
        }

    </style>
</head>

<body>

<div class="container">

<header>
    <h1>Design and Analysis of Algorithms (DAA)</h1>
    <p>LeetCode Assignment Repository</p>
</header>

<section>

<h2>About</h2>

<p>
This repository contains Java solutions for the LeetCode problems assigned in the
Design and Analysis of Algorithms (DAA) course. Every solution focuses on algorithmic
thinking, optimized implementation, and complexity analysis.
</p>

<div class="info">
<b>Language :</b> Java<br>
<b>Platform :</b> LeetCode<br>
<b>Course :</b> Design and Analysis of Algorithms (DAA)
</div>

</section>

<section>

<h2>Assignment 1 - Binary Search</h2>

<table>

<tr>
<th>No.</th>
<th>LeetCode ID</th>
<th>Problem Name</th>
<th>Question Link</th>
</tr>

<tr>
<td>1</td>
<td>704</td>
<td>Binary Search</td>
<td><a href="https://leetcode.com/problems/binary-search/" target="_blank">Open Problem</a></td>
</tr>

<tr>
<td>2</td>
<td>35</td>
<td>Search Insert Position</td>
<td><a href="https://leetcode.com/problems/search-insert-position/" target="_blank">Open Problem</a></td>
</tr>

<tr>
<td>3</td>
<td>74</td>
<td>Search a 2D Matrix</td>
<td><a href="https://leetcode.com/problems/search-a-2d-matrix/" target="_blank">Open Problem</a></td>
</tr>

<tr>
<td>4</td>
<td>33</td>
<td>Search in Rotated Sorted Array</td>
<td><a href="https://leetcode.com/problems/search-in-rotated-sorted-array/" target="_blank">Open Problem</a></td>
</tr>

<tr>
<td>5</td>
<td>162</td>
<td>Find Peak Element</td>
<td><a href="https://leetcode.com/problems/find-peak-element/" target="_blank">Open Problem</a></td>
</tr>

</table>

</section>

<section>

<h2>Assignment 2 - Sorting & Divide and Conquer</h2>

<table>

<tr>
<th>No.</th>
<th>LeetCode ID</th>
<th>Problem Name</th>
<th>Question Link</th>
</tr>

<tr>
<td>1</td>
<td>88</td>
<td>Merge Sorted Array</td>
<td><a href="https://leetcode.com/problems/merge-sorted-array/" target="_blank">Open Problem</a></td>
</tr>

<tr>
<td>2</td>
<td>912</td>
<td>Sort an Array</td>
<td><a href="https://leetcode.com/problems/sort-an-array/" target="_blank">Open Problem</a></td>
</tr>

<tr>
<td>3</td>
<td>215</td>
<td>Kth Largest Element in an Array</td>
<td><a href="https://leetcode.com/problems/kth-largest-element-in-an-array/" target="_blank">Open Problem</a></td>
</tr>

<tr>
<td>4</td>
<td>53</td>
<td>Maximum Subarray</td>
<td><a href="https://leetcode.com/problems/maximum-subarray/" target="_blank">Open Problem</a></td>
</tr>

<tr>
<td>5</td>
<td>4</td>
<td>Median of Two Sorted Arrays</td>
<td><a href="https://leetcode.com/problems/median-of-two-sorted-arrays/" target="_blank">Open Problem</a></td>
</tr>

</table>

</section>

<section>

<h2>Objectives</h2>

<ul>
<li>Understand Binary Search algorithms.</li>
<li>Implement Divide and Conquer techniques.</li>
<li>Practice Sorting algorithms.</li>
<li>Analyze Time Complexity and Space Complexity.</li>
<li>Develop efficient Java programming skills.</li>
<li>Improve problem-solving ability through LeetCode.</li>
</ul>

</section>

<section>

<h2>Student Information</h2>

<table>

<tr>
<td><b>Name</b></td>
<td>________________________</td>
</tr>

<tr>
<td><b>Enrollment Number</b></td>
<td>________________________</td>
</tr>

<tr>
<td><b>Course</b></td>
<td>Design and Analysis of Algorithms</td>
</tr>

<tr>
<td><b>Language</b></td>
<td>Java</td>
</tr>

</table>

</section>

<footer>
© 2026 DAA Assignment | LeetCode Java Solutions
</footer>

</div>

</body>

</html>
