package simple;
import java.util.*;

class Solution
{
    public static void sort012(int arr[], int n)
    {
        int zero = 0;
        int ones = 0;
        int twos = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
            if(arr[i]==1){
                ones++;
            }
            if(arr[i]==2){
                twos++;
            }
        }
        for(int i=0;i<n;i++){
            if(zero!=0){
                arr[i]=0;
                zero--;
            }else if(ones!=0){
                arr[i] = 1;
                ones--;
            }else{
                arr[i] = 2;
                twos--;
            }
        }
    }
}
public class sort012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			Solution s = new Solution();
			s.sort012(arr,n);
			StringBuffer str = new StringBuffer();
			for(int i=0;i<n;i++) {
				str.append(arr[i]+" ");
			}
			System.out.println(str);
			}
		}

	}


