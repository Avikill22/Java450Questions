package simple;
import java.util.*;
public class findDuplicate {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(findDuplicate(arr));

	}
	//problem can be solved with hashset and sorting but i have used linkedList cycle concept.
	 public static int findDuplicate(int[] nums) {
	        int tor = nums[0];
	        int har = nums[0];
	        do{
	            tor = nums[tor];
	            har = nums[nums[tor]];
	        }while(tor != har);
	        
	        tor = nums[0];
	        while(tor !=har){
	            tor = nums[tor];
	            har = nums[har];
	        }
	        
	        return har;
	    }
}
