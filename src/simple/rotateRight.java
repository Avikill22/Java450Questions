package simple;

import java.util.Arrays;

public class rotateRight {

	public static void main(String[] args) {
		long arr[] = new long[] {12,3,4,5,10};
		rotate(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void rotate(long arr[], long n)
    {
        long temp = arr[0];
        long temp1;
        for(int i=0;i<n-1;i++){
            temp1 = temp;
            temp = arr[i+1];
            arr[i+1] = temp1;
        }
        arr[0] = temp;
    }

}
