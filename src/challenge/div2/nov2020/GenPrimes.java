package challenge.div2.nov2020;

import java.util.ArrayList;
import java.util.List;

public class GenPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit = 1299828;
		List<Integer> primeList = new ArrayList<>();
		for (int i = 2; i <= limit; i++) {
			
			int root = (int)Math.sqrt( i );
			int flag = 1;
			for (int j = 2; j <= root; j++) {
				if( i == 1) {
					flag = 0;
					break;
				}
				if( i % j == 0 )
				{
					flag = 0;
					break;
				}
				
			}
			if( flag == 1)
			{
				primeList.add(i);
			}
		}
		System.out.println(primeList);
	}

}
