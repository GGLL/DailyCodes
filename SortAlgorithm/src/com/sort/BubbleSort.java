package com.sort;

public class BubbleSort {
	public static void bubbleSort(int[] arr) throws Exception{
		if(arr == null || arr.length == 0){
			throw new Exception("argument is null");
		}
		for(int i = 0;i < arr.length;i++){
			for(int j=arr.length-1;j>i;j--){
				if(arr[j]<arr[j-1]){
					swap(arr, j-1, j);
				}
			}
		}
	}
	
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
