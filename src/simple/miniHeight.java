package simple;
import java.util.*;

public class miniHeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(minJumps(arr));
		
	}
	
	static int minJumps(int[] arr){
        return minJumpsRec(arr,0);
    }
    static int minJumpsRec(int arr[],int i){
        if(i>=arr.length-1){
            return 0;
        }
        int count = Integer.MAX_VALUE;
        for(int j=0;j<arr[i] && j<arr.length;++j){
            count = Math.min(count,1+minJumpsRec(arr,i+j+1));
        }
        return count;
    }

}
