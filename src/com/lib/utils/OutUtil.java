package com.lib.utils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/**
 * 输出各式数据
 * @author Administrator
 *
 */
public class OutUtil {

	/**
	 * 输出数组元素
	 * @param nums
	 * @param i
	 * @param j
	 */
	public static void outArr(int[] nums){
		System.out.println(Arrays.toString(nums));
	}
	/**
	 * 输出Map元素
	 * @param nums
	 * @param i
	 * @param j
	 */
	public static void outMap(Map<Integer,Integer> map){
		for (Integer key : map.keySet()) {
			
			System.out.println(key+"重复："+map.get(key)+"次");
		}
		
	}
}
