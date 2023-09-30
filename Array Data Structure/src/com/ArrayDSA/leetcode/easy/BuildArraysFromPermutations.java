package com.ArrayDSA.leetcode.easy;

// 1920. Build Array from Permutation
// Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
// A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
public class BuildArraysFromPermutations {

	public static void main(String[] args) {
		int[] nums = {0,2,1,5,3,4};
		int[] ans = buildArrays(nums);
		for(int x: ans) {
			System.out.print(x+",");
		}
	}
	static int[] buildArrays(int[] nums) {
		
		int[] ans = new int[nums.length];
		for (int i=0;i<=ans.length-1;i++) {
			ans[i] = nums[nums[i]];
		}
		return ans;
	}
}


