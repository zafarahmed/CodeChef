package challenge.div2.nov2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IMW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner( System.in );
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int k = in.nextInt() + 1;
			String s = in.next();
			String[] sArr = s.split("X");
			System.out.println( solve(sArr, k) );
		}
		in.close();
	}
	
	public static int solve( String[] sArr, int k )
	{
		int num = 0;
		for (int i = 0; i < sArr.length; i++) {
			num += tokenize(sArr[i], k);
		}
		
		
		return num;
	}
	
	public static int tokenize( String s, int k)
	{
		List<Integer> mList = new ArrayList<>();
		List<Integer> iList = new ArrayList<>();
		List<Integer>  csList = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if( s.charAt(i) == 'M')
			{
				mList.add(i);
			}
			else if( s.charAt(i) == 'I')
			{
				iList.add(i);
			}
			else if( s.charAt(i) == ':')
			{
				csList.add(i);
			}
		}
		return compute(mList, iList, csList, k);
	}
	
	public static int compute( List<Integer> mList, List<Integer> iList, List<Integer> csList, int k)
	{
		List<Integer> iUsed = new ArrayList<>();
		int num = 0;
		for (int j = 0; j < mList.size(); j++ ) {
			int m = mList.get(j);
			for (int l = 0; l < iList.size(); l++) {
				int i = iList.get(l);
				if( !iUsed.contains(i))
				{
					int csCount = getCSCount(m, i, csList);
					int p = k - Math.abs( m - i) - csCount;
					if( p > 0)
					{
						num++;
						iUsed.add(i);
						break;
						
					}
				}
				
			}
		}
		return num;
	}
	
	public static int getCSCount( int m, int i, List<Integer> csList)
	{
		int count = 0;
		for (int j = 0; j < csList.size(); j++) {
			int cs = csList.get(j);
			if( (cs > m && cs < i) || (  cs > i && cs < m ) )
			{
				count++;
			}
		}
//		if( m < i)
//		{
//			for (Integer cs : csList) {
//				if( cs > m && cs < i)
//				{
//					count++;
//				}
//			}
//		}
//		else
//		{
//			for (Integer cs : csList) {
//				if( cs > i && cs < m)
//				{
//					count++;
//				}
//			}
//		}
		return count;
	}

}
