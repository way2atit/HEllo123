package com.practice;

public class ArrayHandling {

	public static void main(String[] args) {

		int[][] a = new int[2][5];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[0][3] = 40;
		a[0][4] = 50;
		
		a[1][0] = 34;
		a[1][1] = 45;
		a[1][2] = 56;
		a[1][3] = 23;
		a[1][4] = 56;
		

		System.out.println(a.length);// 5

		for (int i = 0; i < a.length; i++) { // 0 1 2 3 4

			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j]+ " ");
			}
			System.out.println();

		}
	}
}
