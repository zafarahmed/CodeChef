package challenge.div2.oct2020;

import java.util.Scanner;

public class POSAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in );
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			System.out.println(generateString(n));
		}
		in.close();
	}
	
	public static String generateString( int n)
	{
		StringBuilder result = new StringBuilder();
		if( n == 1) {
			return "1";
		}
		else if( ( (n - 1) & n ) == 0 )
		{
			return "-1";
		}
		else if ( n == 3 ) {
			return "2 3 1";
		}
		else
		{
			int pow = 0;
			int quo = n;
			while( (quo/2) > 0) {
				pow++;
				quo = quo/2;
			}
			for (int i = 2; i < pow; i++) {
				int start = (int) Math.pow(2, i);
				int end = (int) Math.pow(2, i + 1) - 1;
				StringBuilder temp = new StringBuilder(" " + (start + 1) + " " + start );
				for (int j = start + 2; j <= end; j++) {
					
						temp.append(" ").append(j);
					
					
				}
				result.append(temp);
			}

			int start = (int) Math.pow(2, pow);
			int end = (int) Math.pow(2, pow +1) - 1;
			StringBuilder temp = new StringBuilder(" " + (start + 1) + " " + start );
			for (int j = start + 2; j <= end; j++) {
				if( j <= n) {
					temp.append(" ").append(j);
				}
				
			}
			result.append(temp);
		
			
			
		}
		return "2 3 1" + result;
	}

}
