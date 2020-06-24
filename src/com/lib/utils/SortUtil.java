package com.lib.utils;
/**
 * 排序公用方法
 * @author Administrator
 *
 */
public class SortUtil {

	
	/**
	 * 整型数组元素交换方法
	 * @param nums
	 * @param i
	 * @param j
	 */
	public static void swap(int[] nums,int i ,int j){
		int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
		//
//		int t = nums[i];
//		int y = nums[j];
//		nums[i] = y;
//		nums[j] = t;
	}
}
