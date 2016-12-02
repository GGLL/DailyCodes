package com.sort;

import java.util.Stack;

public class QuickSort {
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
	public static int partition(int[] a,int l,int r){
		int part = a[l],i = l,j = r;
		while(i<j){
			while(i<r && a[i]<part)
				i++;
			while(j>l && a[j]>part)
				j--;
			if(i<j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
			}
		}
		//a[i] = part;
		return i;
	}
	/**
	 * 递归方式
	 * @param arr
	 * @param left
	 * @param right
	 * @throws Exception
	 */
	public static void quickSort(int[] arr,int left,int right) throws Exception{
		if(arr==null || arr.length <=0)
			throw new Exception("argument is null");
		if(left<right){
			int position= partition(arr, left, right);//adjustArray(arr, left, right);
			if(position > left)
				quickSort(arr, left, position-1);
			if(position < right)
				quickSort(arr, position+1, right);
		}
	}
	
	/**
	 * 非递归方式
	 * 利用栈来处理
	 * @param arr
	 * @param left
	 * @param right
	 * @throws Exception 
	 */
	public static void quickSort_(int[] arr,int left,int right) throws Exception{
		if(arr==null || arr.length <=0)
			throw new Exception("argument is null");
		Stack<Integer> s = new Stack<Integer>();
		s.push(left);
		s.push(right);
		while(!s.empty()){
			int j = s.pop();//right
			int i = s.pop();//left
			if(j<=i) continue;//如果右索引小于等于左索引说明结束
			
			int position = partition(arr, i, j);
			if(position-1 > i){
				s.push(i);//左索引
				s.push(position-1);//右索引
			}
			if(position+1 < j){
				s.push(position+1);//左索引
				s.push(j);//右索引
			}
			//System.out.println(Arrays.toString(s.toArray()));
		}
	}
}
