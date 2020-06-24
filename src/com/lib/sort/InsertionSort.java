package com.lib.sort;

import java.util.Arrays;

/**
 * 插入排序：
 * 
 * 排序理解：
 *  1.给定一个数组 
 *  2.进入条件（开始排序的场景）
 *  3.决定最优算法（空间/时间根据场景最合适）
 *  4.排序完成判断（结束排序场景）
 * 
 * @author Administrator
 *
 */
public class InsertionSort  {

	private static void insertionSort(int[] nums) {
        for (int i = 1, j, current; i < nums.length; ++i) {
            current = nums[i];
            for (j = i - 1; j >= 0 && nums[j] > current; --j) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = current;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = { 1, 2, 7, 9, 5, 8 };
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
