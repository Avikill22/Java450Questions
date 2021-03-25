package simple;
import java.util.*;

public class UnionTwo {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a[] = new int[] {1,2,33,44,5,0};
		int b[] = new int[] {1,2,330,88};
		Set<Integer> s = new HashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            s.add(b[i]);
        }
        System.out.println(s.size());

	}

}
