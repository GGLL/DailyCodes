package com.sort;

import java.util.Arrays;

public class MainTest {
	public static void main(String[] args) {
		int[] bubbleCase= {4,1,2,1,8,5,6};
		try {
			//BubbleSort.bubbleSort(bubbleCase);
			SelectSort.selectSort(bubbleCase);
			System.out.println(Arrays.toString(bubbleCase));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
