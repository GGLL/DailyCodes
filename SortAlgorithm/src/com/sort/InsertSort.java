package com.sort;

public class InsertSort {
	public static int[] insertSort(int[] arr) throws Exception{
		if(arr == null || arr.length <= 0){
			throw new Exception("arguments null");
		}else if(arr.length == 1){
			return arr;
		}else {
			int target = 0;
			for(int i = 1;i < arr.length;i++){
				target = arr[i];//¥˝≤Â»Î
				int j = i;
				while(j > 0 && (arr[j-1]>target)){//∫Û“∆
					arr[j] = arr[j-1];
					j--;
				}
				arr[j] = target;
			}
			return arr;
		}
		
	}
}
