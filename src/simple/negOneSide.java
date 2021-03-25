package simple;

import java.util.*;

public class negOneSide {

	public static void main(String[] args) {
		int arr[] = new int[] {12,3,-4,-5,48198,77};
		System.out.println(Arrays.toString(arr));
//		rearrange(arr,0,arr.length-1);
		twoPointerConcept(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

	private static void twoPointerConcept(int[] arr, int low, int high) {
		while(low<=high) {
			if(arr[low]<0 && arr[high]<0) {
				low++;
			}else if(arr[low]>0 && arr[high]<0) {
				int temp = arr[low];
				arr[low] =arr[high];
				arr[high] = temp;
				low++; high--;
			}else if(arr[low]<0 && arr[high]>0) {
				high--;
			}else {
				low++;
				high--;
			}
		}
		
	}

	private static void rearrange(int[] arr, int low, int high) {
		int j = 0,temp;
		for(int i=low;i<=high;i++) {
			if(arr[i]<0) {
			if(i!=j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
			j++;
			}
		}
		
	}

}
