package com.lib.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.lib.utils.OutUtil;
import com.lib.utils.SortUtil;

/**
 * 查询除数组中重复的数及重复次数
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
		int[] nums = {2, 3, 1, 0, 2, 5, 3,3,3,2,5,0};
		Map<Integer,Integer> numberMap = findRepeat(nums);
		OutUtil.outMap(numberMap);
	}
	
	
	public static Map<Integer,Integer>  findRepeat(int[] nums){
		Map<Integer,Integer> arrMap = new HashMap<>();
		for (int i = 0	; i < nums.length; ++i) {
			while (i!=nums[i]) {
				if(nums[i] == nums[nums[i]]){
					//存在Map集合中，取出集合的value 值加1，否则置1
					arrMap.put(nums[i],arrMap.get(nums[i])!=null?(arrMap.get(nums[i])+1):1);
					break;
				}
				SortUtil.swap(nums, i, nums[i]);
			}
		}
		return arrMap;
	}
}
