package com.sort;

public class SelectSort {
	public static void selectSort(int[] arr) throws Exception{
		if(arr == null || arr.length == 0){
			throw new Exception("arguments null");
		}
		int minIndex = 0;
		for(int i = 0;i < arr.length;i++){
			minIndex = i;
			for(int j=arr.length-1;j>i;j--){
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}
			}
			if(minIndex != i){
				swap(arr, minIndex, i);
			}
		}
	}
	
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
