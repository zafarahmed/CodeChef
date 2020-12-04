package challenge.newbee102020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PREGLO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String s = in.next();
			int index  = s.lastIndexOf('r');
			solve(s.substring(0, index));
		}
		in.close();
	}
	
	public static int solve( String s)
	{
		System.out.println(s);
		return -1;
	}

}
