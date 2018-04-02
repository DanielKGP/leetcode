##Single Number
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?



###solution one
最直接的想法暴力搜索，用数据结构里的栈，有点类似于括号匹配，但比括号匹配简单。首先将所有数字压栈，再pop第一个数入另一个栈。两层循环判断第一个栈pop出来的数字在第二个栈里有没有，有的话第二个栈内对应的数字删去，否则入栈。知道最后，原栈里的剩下的数就是SingleOne了。

这个方法是无法通过的，时间复杂度为O(n^2)

###solution two
可以利用python语言的特性计算：

	2∗(a+b+c)−(a+a+b+b+c)=c
	
	class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        return 2 * sum(set(nums)) - sum(nums)
	
对于Python的hashtable的特性还不熟悉

###solution three

XOR异或

	a⊕0=a
	
	a⊕a=0
	
	a⊕b⊕a=(a⊕a)⊕b=0⊕b=b
	
	
程序中用于计算异或的符号是 __“^”__
用异或计算就非常快速了，感觉像在解数学题。