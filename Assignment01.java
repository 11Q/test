package com.arua.assignment;

import java.util.Scanner;

/*根据键盘输入的行数列数，创建一个二维数组，并且完成初始化
 * 。然后求出偶数行元素的和，奇数行元素的和，分别输出。*/
public class Assignment01 {

	public static void main(String[] arg) {
		// 定义单行偶数，奇数，和所有偶数奇数行的和
		int sumEven = 0;
		int totalEven = 0;
		int sumOdd = 0;
		int totalOdd = 0;
		// 更具键盘输入行数a和列数b
		Scanner sc = new Scanner(System.in);
		System.out.println("输入二维数组的行:a=");
		int a = sc.nextInt();
		System.out.println("输入二维数组的列:b=");
		int b = sc.nextInt();
		// 创建一个二维数组行数为a的值，列数为b的值
		int[][] array = new int[a][b];
		// 通过for循环动态赋值
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("输入第" + (i + 1) + "行，第" + (j + 1) + "列的数：");
				array[i][j] = sc.nextInt();
			}
		}
		// 求出偶数行元素的和
		for (int i = 0; i < array.length && (i + 1) % 2 == 0; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sumEven += array[i][j];
			}
			totalEven = sumEven;
		}
		System.out.println("偶数行的和为：" + totalEven);
		// 求出奇数行元素的和
		for (int i = 0; i < array.length && (i + 1) % 2 != 0; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sumOdd += array[i][j];
			}
			totalOdd = sumOdd;
		}
		System.out.println("奇数行的和为：" + totalOdd);
	}
}
