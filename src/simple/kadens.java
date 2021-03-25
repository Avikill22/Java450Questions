package simple;
import java.util.*;
public class kadens {

	public static void main(String[] args) {
		
			
		int b[] = new int[] {1,2,-9,0,7,7,-3,8,7,7,1,-10};
		int ans = maxSubarraySum(b,b.length);
		System.out.println(ans);
	}
	static int maxSubarraySum(int arr[], int n){
        
        int sum = 0;
        int end = 0;
        for(int i=0;i<n;i++){
            end +=arr[i];
            if(sum<end){
                sum = end;
            }
            if(end<0){
                end =0;
            }
            
        }
        return sum;
    }

}
