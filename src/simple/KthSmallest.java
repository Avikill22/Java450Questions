package simple;
import java.util.*;
public class KthSmallest {
	private static int primitiveMethod(int arr[],int k) {
		Arrays.sort(arr);
		
		return arr[arr.length-k-1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int ksmallest = primitiveMethod(arr,k);
		

	}

}
