package com.sort;

import java.util.Arrays;

public class MainTest {
	public static void main(String[] args) {
		int[] cases= {4,1,2,1,8,5,6};
		/*
		 * 4,1,2,1,8,5,6
		 * 1,1,2,4,8,5,6
		 */
		
		try {
			//BubbleSort.bubbleSort(cases);
			//SelectSort.selectSort(cases);
			//InsertSort.insertSort(cases);
			//QuickSort.quickSort(cases, 0, 6);
			QuickSort.quickSort_(cases, 0, 6);
			System.out.println(Arrays.toString(cases));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
