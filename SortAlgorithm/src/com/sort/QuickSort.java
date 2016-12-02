package com.sort;

public class QuickSort {
	//*****************递归方式
	//返回调整后基准数的位置
	public static int adjustArray(int s[],int left,int right){
		int i = left,j = right;
		int x = s[left];//s[l]为第一个基准数
		while(i<j){
			//从右向左找小于基准数X的数
			while(i<j && s[j]>=x)
				j--;
			if(i<j){
				s[i] = s[j];
				i++;
			}
			//从左向右找大于基准数X的数
			while(i<j && s[i]<x)
				i++;
			if(i<j){
				s[j] = s[i];
				j--;
			}
		}
		//退出时i=j
		s[i]=x;
		return i;
	}
	//简洁优化版本
	public static int pritation(int[] a,int l,int r){
		int priot = a[l],i = l,j = r;
		while(i<j){
			while(i<r && a[i]<priot)
				i++;
			while(j>l && a[j]>priot)
				j--;
			if(i<j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
			}
		}
		a[i] = priot;
		return i;
	}
	public static void quickSort(int[] arr,int left,int right) throws Exception{
		if(left<right){
			int index= pritation(arr, left, right);//adjustArray(arr, left, right);
			if(index > left)
				quickSort(arr, left, index-1);
			if(index < right)
				quickSort(arr, index+1, right);
		}
	}
	
	//*****************非递归方式
	
}
