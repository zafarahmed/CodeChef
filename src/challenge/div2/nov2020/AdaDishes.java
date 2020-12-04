package challenge.div2.nov2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AdaDishes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in );
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			List<Integer> dishList = new ArrayList<>(n);
			for (int j = 0; j < n; j++) {
				dishList.add(in.nextInt());
			}
			System.out.println( solve(dishList) );
		}
		in.close();
	}
	
	public static int solve( List<Integer> dishList)
	{
		Collections.sort( dishList );
		int b1 = 0;
		int b2 = 0;
		for (int i = dishList.size() - 1; i >= 0 ; i--) {
			if( b1 + dishList.get(i) < b2 + dishList.get(i) ) {
				b1 += dishList.get(i);
			}
			else {
				b2 += dishList.get(i);
			}
		}
		return Math.max(b1, b2);
		
	}

}
