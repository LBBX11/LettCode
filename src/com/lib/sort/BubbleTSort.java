package com.lib.sort;


/**
 * 泛型交换数组位置
 * 
 * 排序理解： 1.给定一个数组 2.进入条件（开始排序的场景） 3.决定最优算法（空间/时间根据场景最合适） 4.排序完成判断（结束排序场景）
 * 
 * @author Administrator
 *
 */
public class BubbleTSort {

	public static void main(String[] args) {
		swap(new String[] { "1", "2", "3" }, 1, 2);
	}

	/**
	 * 泛型
	 * 
	 * @PARAM T
	 * @PARAM I
	 * @PARAM J
	 * @RETURN
	 */
	public static <t> t[] swap(t[] t, int i, int j) {
		System.out.println("未变**：" + t[i] + "位置：" + i + "__" + t[j] + "位置：" + j);
		t tmp = t[i];
		t[i] = t[j];
		t[j] = tmp;
		System.out.println("改变**：" + t[i] + "位置：" + i + "__" + t[j] + "位置：" + j);
		return t;
	}

}
