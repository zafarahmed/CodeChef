package challenge.newbee102020;

import java.util.Scanner;

public class HNH01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in );
		int t = in.nextInt();
		for (int i = 0; i < t ; i++ )
		{
		    String s = in.next();
		    System.out.println(solve(s));
		}
		in.close();
	}
	public static int solve( String s)
	{
		String[] sArr = s.split("");
		return sArr.length;
	}

}
