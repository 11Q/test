package com.arua.assignment;

import java.util.Scanner;

/*    2.静态初始化一个不规整的二维数组
	 * ，比如arr1。然后根据arr1，
	 * 动态初始化一个一模一样的新的二维数组。
	 */
public class Assignment02 {
	public static void main(String[] args) {
		// 静态初始化一个不规则的二维数组
		int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5 }, { 7 } };
		Scanner sc = new Scanner(System.in);
		// 定义不规则的二维数组arr2
		int[][] arr2 = new int[arr1.length][];
		// 给数组arr2赋值
		// 外层循环控制数组arr2的行数
		for (int i = 0; i < arr1.length; i++) {
			// 每循环一次重新定义一个一维数组a
			int[] a = new int[arr1[i].length];
			// 内层循环控制数组arr2第(i+1)行所存储的数组a
			for (int j = 0; j < arr1[i].length; j++) {
				// 给数组arr2第(i+1)行的数组a赋值
				System.out.println("请输入数字arr2第" + (i + 1) + "行第" + (j + 1) + "列的元素");
				a[j] = sc.nextInt();
			}
			// 将一维数组a存储在二维数组arr2的(i+1)行
			arr2[i] = a;
		}
		// 遍历二维数组arr2
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println("数组arr2的第" + (i + 1) + "行第" + (j + 1) + "列元素为" + arr2[i][j]);

			}
		}
	}
}
