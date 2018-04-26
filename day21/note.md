## Longest Increasing Subsequence

Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity?

### solution one 

思路：跟排序后的数组求最长子序列。

复习一下最长子序列，动态规划表达式：

	c[i,j] = 0, if i==0 or j ==0
	         
	c[i,j] = c[i-1,j-1]+1, if i,j>0 && xi == yi
	
	c[i,j] = max(c[i,j-1],c[i-1,j]), if i,j>0 && xi != yi
	         