package com.lib.sort;

import java.util.Arrays;

import com.lib.utils.OutUtil;
import com.lib.utils.SortUtil;

/**
 * 冒泡排序
 * 
 * 排序理解：
 * 1.给定一个数组
 * 2.进入条件（开始排序的场景）
 * 3.决定最优算法（空间/时间根据场景最合适）
 * 4.排序完成判断（结束排序场景）
 * @author Administrator
 * 注：
 * 1)使用包装类可直接交换数组元素
 * 2)【基本数据类型】:(1)x（变量名）= 具体值,并没有改变数组里面的内容(2)方法中，形参不能改变实参
 */
public class BubbleIntSort {

	public static void main(String[] args) {
		int[] nums = {1, 2, 7, 9, 5, 8};
        bubbleSort(nums);
        OutUtil.outArr(nums);
	}

	/**
	 * 冒泡排序主体
	 * @param nums
	 */
	public static void bubbleSort(int[] nums){
		//(2)进入条件
		boolean hasChange = true;
		// i -循环，用于每一个数组元素与未排序的元素进行比较
		//-1 :防止j+1 报异常（ArrayIndexOutOfBoundsException)
		for (int i = 0; i < nums.length-1 && hasChange; i++) {
			hasChange = false;
			for (int j = 0; j < nums.length-1-i; j++) {
				if(nums[j] > nums[j+1]){
					SortUtil.swap(nums,j,j+1);
					hasChange = true;
				}
			}
			
		}
		
	}
	
}
