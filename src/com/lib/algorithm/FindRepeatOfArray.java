package com.lib.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.lib.utils.OutUtil;
import com.lib.utils.SortUtil;

/**
 * 查询除数组中重复的数
 * 
 * 解题思路：将该数组的值放置于数组值的数组中的位置。
 * example：  
 * int[] arr = [];
 * int index = 1;
 * arr[index] = index;
 * @author Administrator
 *
 */
public class FindRepeatOfArray  {

	
	public static void main(String[] args) {
		int[] nums = {2, 3, 1, 0, 2, 5, 3};
		Map<Integer,Integer> numberMap = findRepeat(nums);
		OutUtil.outMap(numberMap);
	}
	
	
	public static Map<Integer,Integer>  findRepeat(int[] nums){
		Map<Integer,Integer> arrMap = new HashMap<>();
		for (int i = 0	; i < nums.length; ++i) {
			int count = 0;
			while (i!=nums[i]) {
				if(nums[i] == nums[nums[i]]){
					count++;
					continue;
				}
				SortUtil.swap(nums, i, nums[i]);
			}
			arrMap.put(nums[i], count);
		}
		return arrMap;
	}
}
