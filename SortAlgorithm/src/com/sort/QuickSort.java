package com.sort;

public class QuickSort {
	//*****************�ݹ鷽ʽ
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
	
	//*****************�ǵݹ鷽ʽ
	
}
