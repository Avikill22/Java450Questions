package simple;

import java.util.Arrays;

public class quicksort {
	private static void swap (int a[],int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	private static int partition(int a[],int low,int high) {
		int pivot = a[high];
		int i = low-1;
		for(int j = low ;j<high;j++) {
			if(a[j]<pivot) {
				i++;
				swap(a,j,i);
			}
		}
		swap(a,i+1,high);
		return i+1;
	}
	private static void quicksort(int a[],int low,int high) {
		if(low<high) {
			int pi = partition(a,low,high);
			quicksort(a,low,pi-1);
			quicksort(a,pi+1,high);
		}
	}
	public static void main(String args[]) {
		int arr[] = new int[] {12,3,4-5,48198,77};
		System.out.println(Arrays.toString(arr));
		quicksort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
