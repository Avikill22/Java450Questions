package simple;
import java.util.*;

public class maxMin {
	static class pair{
		public int max;
		public int min;
	}
	static int[] simple(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			min  = Math.min(min,arr[i]);
			max = Math.max(max,arr[i]);
		}
		int a[] = new int[2];
		a[0] = min;
		a[1] = max;
		return a;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//for simple method
		int a[] = simple(arr);
		System.out.println(a[0]+" "+a[1]);
		pair a1 = tornament(arr,0,arr.length-1);
		System.out.println(a1.min+" "+a1.max);
	}
	static pair tornament(int[] arr,int low,int high) {
//		Pair MaxMin(array, array_size)
//		   if array_size = 1
//		      return element as both max and min
//		   else if arry_size = 2
//		      one comparison to determine max and min
//		      return that pair
//		   else    /* array_size  > 2 */
//		      recur for max and min of left half
//		      recur for max and min of right half
//		      one comparison determines true max of the two candidates
//		      one comparison determines true min of the two candidates
//		      return the pair of max and min\
		pair minmax = new pair();
		pair mleft = new pair();
		pair mright = new pair();
		int mid;
		
		if(low == high) {
			minmax.min = arr[low];
			minmax.max = arr[high];
			return minmax;
		}else if(high==low+1) {
			if(arr[high]>arr[low]) {
				minmax.min = arr[low];
				minmax.max = arr[high];
				return minmax;
			}else {
				minmax.min = arr[high];
				minmax.max = arr[low];
				return minmax;
			}
		}
		mid = (low +high)/2;
		mleft =  tornament(arr,low,mid);
		mright = tornament(arr,mid+1,high);
		minmax.max = Math.max(mleft.max,mright.max);
		minmax.min = Math.min(mleft.min,mright.min);
		
		return minmax;
	}
		

}
