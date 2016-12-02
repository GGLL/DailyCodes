package com.sort;

import java.util.Stack;

public class QuickSort {
	//���ص������׼����λ��
	public static int adjustArray(int s[],int left,int right){
		int i = left,j = right;
		int x = s[left];//s[l]Ϊ��һ����׼��
		while(i<j){
			//����������С�ڻ�׼��X����
			while(i<j && s[j]>=x)
				j--;
			if(i<j){
				s[i] = s[j];
				i++;
			}
			//���������Ҵ��ڻ�׼��X����
			while(i<j && s[i]<x)
				i++;
			if(i<j){
				s[j] = s[i];
				j--;
			}
		}
		//�˳�ʱi=j
		s[i]=x;
		return i;
	}
	//����Ż��汾
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
	 * �ݹ鷽ʽ
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
	 * �ǵݹ鷽ʽ
	 * ����ջ������
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
			if(j<=i) continue;//���������С�ڵ���������˵������
			
			int position = partition(arr, i, j);
			if(position-1 > i){
				s.push(i);//������
				s.push(position-1);//������
			}
			if(position+1 < j){
				s.push(position+1);//������
				s.push(j);//������
			}
			//System.out.println(Arrays.toString(s.toArray()));
		}
	}
}
