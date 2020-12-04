package challenge.div2.oct2020;

import java.util.Scanner;

public class CVDRUN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner( System.in );
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			//System.out.println( "#1: " + isInDanger(n, k, x, y));
			System.out.println( isInDanger2(n, k, x, y));
		}
		in.close();
	}
	
	public static String isInDanger( int n, int k, int x, int y)
	{
		if( k == 0 ) 
		{
			if (x == y){
				
				return "YES";
			}
			else 
			{
				return "NO";
			}
		}
		int i = (x+k)%n;
		if( i == y) {
			return "YES";
		}
		while( x != i )
		{
			i = (i+k)%n;
			if( i == y) {
				return "YES";
			}
		}
		return "NO";
	}
	
	public static String isInDanger2( int n, int k, int x, int y)
	{
		if( k == 0 ) {
		if (x == y){
			
			return "YES";
		}
		else {
			return "NO";
		}
		}
		int diff1 = y - x;
		int diff2 = n + diff1;
		 k = k%n;
		 if( (diff1>=0 && diff1 % k == 0) || (diff2>=0 && diff2 % k == 0)  )
		 {
			 return "YES";
		 }
		 else 
		 {
			 return "NO";
		 }
		
	}

}
