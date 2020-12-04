package challenge.div2.oct2020;

import java.util.Scanner;

public class CHEFEZQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in );
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] q = new int[n];
			for (int j = 0; j < n; j++) {
				q[j] = in.nextInt();
			}
			System.out.println(solve(q, k));
		
		}
		in.close();
	}
	
	public static long solve( int[] q, int k ) {
		long diff = 0;
		for (int i = 0; i < q.length; i++) {
			long qVal = q[i] + diff;
			if(qVal < k) {
				return i+1;
			}
			else {
				diff = qVal - k;
			}
		}
		long quo = diff/k;
		//long rem = diff%k;
		//if(rem == 0) {
			return q.length+ quo +1;
		//}
		
		//return q.length + quo;
	}

}

//int diff = 0;
//
//int q = in.nextInt() + diff;
//if( q < k ) {
//	System.out.println(j);
//	break;
//}
//else if (q == k) {
//	System.out.println( j+1 );
//	break;
//}
//else {
//	diff = q - k ;
//}
//int rem = diff%k;
//if( rem == 0 )
//{
//	System.out.println(n+1+diff/k );
//}
//else {
//	System.out.println( n+diff/k );
//}